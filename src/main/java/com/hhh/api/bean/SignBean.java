/**
 * Project Name:api-framework
 * File Name:Sign.java
 * Package Name:com.xxx.api.bean
 * Date:2016-3-25下午4:50:49
 * Copyright (c) 2016, hejiahua@sanhaodai.com All Rights Reserved.
 *
*/

package com.hhh.api.bean;
import org.hibernate.validator.constraints.NotEmpty;

/**
 * 签名对象
 *
 * @author he
 * @since 1.0.0
 */
public class SignBean {
	@NotEmpty
	public String sign;
	
	public String getSign() {
		return sign;
	}

	public void setSign(String sign) {
		this.sign = sign;
	}
	
	
}

