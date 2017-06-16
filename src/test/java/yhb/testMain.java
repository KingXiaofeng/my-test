/**
 *
 */
package yhb;

import com.yhb.util.json.JsonUtils;
import org.json.JSONArray;
import org.json.JSONObject;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Copyright: Copyright (c) 2017
 *
 * @ClassName: testMain.java
 * @Description: 该类的功能描述
 * @author:Krx
 * @date: 2017年5月10日 下午4:22:42
 */
public class testMain {

    public static void main(String[] args) {
        Map map = new HashMap<>();

        String str = "{goods_name:SADF,goods_image:4d5c977d-cec9-4fb1-b5d5-e8246202d6b1.jpg,goods_number:1,goods_money:50.13},{goods_name:AAAA,goods_image:4d5c977d-cec9-4fb1-b5d5-e8246202d6b1.jpg,goods_number:1,goods_money:12.0}";
//
//        JSONObject object = new JSONObject(str);
//        System.out.println(object);
        JSONObject jsonObject = new JSONObject();

        JSONArray json = new JSONArray("["+str+"]");


        JSONObject jsonObject1 = new JSONObject(json);

        map.put("order_goodsInfo", jsonObject1);


        System.out.println(map);

       // System.out.println(JsonUtils.parseJSON2List("["+str+"]"));
    }

}
