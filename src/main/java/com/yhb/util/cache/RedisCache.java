/**
 * 
 */
package com.yhb.util.cache;

import com.yhb.vo.Ip;
import org.apache.commons.beanutils.PropertyUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.data.redis.connection.RedisConnection;
import org.springframework.data.redis.core.RedisCallback;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

import com.yhb.bean.entity.AccountsUsers;
import com.yhb.util.ProtoStuffSerializerUtil;
import com.yhb.util.StringUtil;

import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/**
 * Copyright: Copyright (c) 2017 LanRu-Caifu
 * 
 * @ClassName: RedisCache.java
 * @Description: Redis缓存
 * @author:Krx
 * @date: 2017年4月27日 上午10:22:26
 */
@Component
public class RedisCache {

	public static final String CACHE_NAME = "cache"; // redis 缓存名
	public static final int CACHE_TIME = 1800000; // 默认缓存时间

	public static final String user_cache = RedisCache.CACHE_NAME + ":user:"; // 用户信息token

	/**
	 * redis后缀
	 */
	public static final String SEVENRATES = "dayRevenue:";  //七日收益
	public static final String DISSEVENRATES = "disSevenRates:"; //经销商收益
	public static final String SHOOPINGCAR = "shoopingcar:"; //购物车
	public static final String TOKEN = "token:"; //Token
	public static final String IP = "IP";  //Ip

	@Autowired
	private RedisTemplate<String, String> redisTemplate;

	public <T> boolean putCache(String key, T obj) {
		final byte[] bkey = key.getBytes();
		final byte[] bvalue = ProtoStuffSerializerUtil.serialize(obj);
		boolean result = redisTemplate.execute(new RedisCallback<Boolean>() {
			@Override
			public Boolean doInRedis(RedisConnection connection) throws DataAccessException {
				return connection.setNX(bkey, bvalue);
			}
		});
		return result;
	}

	public <T> void putCacheWithExpireTime(String key, T obj, final long expireTime) {
		final byte[] bkey = key.getBytes();
		final byte[] bvalue = ProtoStuffSerializerUtil.serialize(obj);
		redisTemplate.execute(new RedisCallback<Boolean>() {
			@Override
			public Boolean doInRedis(RedisConnection connection) throws DataAccessException {
				connection.setEx(bkey, expireTime, bvalue);
				return true;
			}
		});
	}

	public <T> boolean putListCache(String key, List<T> objList) {
		final byte[] bkey = key.getBytes();
		final byte[] bvalue = ProtoStuffSerializerUtil.serializeList(objList);
		boolean result = redisTemplate.execute(new RedisCallback<Boolean>() {
			@Override
			public Boolean doInRedis(RedisConnection connection) throws DataAccessException {
				return connection.setNX(bkey, bvalue);
			}
		});
		return result;
	}

	public <T> boolean putListCacheWithExpireTime(String key, List<T> objList, final long expireTime) {
		final byte[] bkey = key.getBytes();
		final byte[] bvalue = ProtoStuffSerializerUtil.serializeList(objList);
		boolean result = redisTemplate.execute(new RedisCallback<Boolean>() {
			@Override
			public Boolean doInRedis(RedisConnection connection) throws DataAccessException {
				connection.setEx(bkey, expireTime, bvalue);
				return true;
			}
		});
		return result;
	}

	public <T> T getCache(final String key, Class<T> targetClass) {
		byte[] result = redisTemplate.execute(new RedisCallback<byte[]>() {
			@Override
			public byte[] doInRedis(RedisConnection connection) throws DataAccessException {
				return connection.get(key.getBytes());
			}
		});
		if (result == null) {
			return null;
		}
		return ProtoStuffSerializerUtil.deserialize(result, targetClass);
	}

	public <T> List<T> getListCache(final String key, Class<T> targetClass) {
		byte[] result = redisTemplate.execute(new RedisCallback<byte[]>() {
			@Override
			public byte[] doInRedis(RedisConnection connection) throws DataAccessException {
				return connection.get(key.getBytes());
			}
		});
		if (result == null) {
			return null;
		}
		return ProtoStuffSerializerUtil.deserializeList(result, targetClass);
	}

	/**
	 * 精确删除key
	 * 
	 * @param key
	 */
	public void deleteCache(String key) {
		redisTemplate.delete(key);
	}

	/**
	 * 模糊删除key
	 * 
	 * @param pattern
	 */
	public void deleteCacheWithPattern(String pattern) {
		Set<String> keys = redisTemplate.keys(pattern);
		redisTemplate.delete(keys);
	}

	/**
	 * 清空所有缓存
	 */
	public void clearCache() {
		deleteCacheWithPattern(RedisCache.CACHE_NAME + ":*");
	}

	/**
	 * 更新key对象field的值
	 * 
	 * @param key 缓存key
	 * @param_obj 缓存对象obj
	 * @param_timeout  缓存时间值
	 * @param_TimeUnit  缓存时间值
	 */
	public void updataCache(String key,Integer time) {
			redisTemplate.expire(key, time, TimeUnit.MILLISECONDS);
	}

	/**
	 * 判断token是否存在
	 */
	public boolean tokenExit(String token) {
		String cache_key = RedisCache.user_cache + RedisCache.TOKEN + token;
		// 更新redis
		AccountsUsers user = getCache(cache_key, AccountsUsers.class);
		if (user != null) {
			// 获取用户信息,更新redis时间
			updataCache(cache_key,RedisCache.CACHE_TIME);
			return true;
		}

		return false;
	}

	/**
	 * 判断IP是否存在
	 * @return
	 */
	public boolean IpExit(String ip){
		String cache_key = RedisCache.user_cache + RedisCache.IP + ip;
		Ip cache_ip =  getCache(cache_key, Ip.class);
		//插入空值
		Ip insertIp = new Ip();
		if (cache_ip == null) {
			//为空时则插入Ip和新记录数 1
			insertIp.setIp(ip);
			insertIp.setCount(1);
			putCacheWithExpireTime(RedisCache.user_cache + RedisCache.IP, insertIp, 3000);

			return true;
		}else {
			//当前记录数
			Integer count = cache_ip.getCount();
			//当Ip在3秒内提交多次，提示操作频繁
			if (count >= 5) {
				return false;
			}
			//清除Ip信息记录
			deleteCache(cache_key);
			//重新插入Ip信息记录
			insertIp.setIp(ip);
			insertIp.setCount(count+1);
			//重新存储时间
			putCacheWithExpireTime(RedisCache.user_cache + RedisCache.IP, insertIp,3000- RedisUtil.getttlTime(cache_key));
			return true;
		}
	}


	
	/**
	 * 获取用户redis里面的值
	 * @param <T>
	 * 
	 * @param type 根据type判断用户取redis的值
	 * @param clsszee 返回不同的用户token
	 */
	public <T> T getUserRedis(String token,int type,Class<T> clsszee){
		String cache_key = "";
		
		//加入type没有值，则默认为获取用户token信息
		if(type==0){
			type = 1;
		}
		
		switch (type) {
		case 1: // 用户token
			cache_key = RedisCache.user_cache + RedisCache.TOKEN + token;
			break;
		case 2:  //七日收益
			cache_key = RedisCache.user_cache + RedisCache.SEVENRATES + token;
	        break;
		case 3:  //经销商七日收益
			cache_key = RedisCache.user_cache + RedisCache.DISSEVENRATES + token;
			break;
		case 4:  //购物车token信息
			cache_key = RedisCache.user_cache + RedisCache.SHOOPINGCAR + token;
			break;
		default:
			break;
		}
		
		//获取token
	    if(StringUtil.isNotBlank(cache_key)){
	      return getCache(cache_key, clsszee);
	    }
		
		return null;
	}

}
