/**
 * default_1476154119719
 * 覆盖全，秒响应，超稳定！验证姓名+身份证号+银行卡号+手机号是否一致。实时联网核查结果！---捷安数据
 *
 * OpenAPI spec version: 1.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.yhb.common.bankcardvertify.wxlink.auth;

import com.squareup.okhttp.Credentials;
import com.yhb.common.bankcardvertify.wxlink.Pair;

import java.util.List;
import java.util.Map;


public class HttpBasicAuth implements Authentication {
	private String username;
	private String password;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public void applyToParams(List<Pair> queryParams, Map<String, String> headerParams) {
		if (username == null && password == null) {
			return;
		}
		headerParams.put("Authorization",
				Credentials.basic(username == null ? "" : username, password == null ? "" : password));
	}
}
