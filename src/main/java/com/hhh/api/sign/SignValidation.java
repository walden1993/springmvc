/**
 * Project Name:api-framework
 * File Name:SignValidation.java
 * Package Name:com.xxx.api.sign
 * Date:2016-3-25下午4:19:27
 * Copyright (c) 2016, hejiahua@sanhaodai.com All Rights Reserved.
 *
*/

package com.hhh.api.sign;

import com.hhh.api.bean.SignBean;

/**
 * 签名验证
 *
 * @author he
 * @since 1.0.0
 */
public interface SignValidation {
	
	/**
	 * 验证
	 * @Description 对object对象的加签字段进行验证
	 * @param  signBean  验证对象
	 * @return boolean  结果 true or false
	 * @author hejiahua
	 * @date 2016-3-25
	 */
	boolean validation(SignBean signBean);
	
}

