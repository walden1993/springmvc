/**
 * Project Name:api-framework
 * File Name:SignValidationManager.java
 * Package Name:com.xxx.api.sign.imp
 * Date:2016-3-25下午4:21:20
 * Copyright (c) 2016, hejiahua@sanhaodai.com All Rights Reserved.
 *
 */

package com.hhh.api.sign.imp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.hhh.api.bean.SignBean;
import com.hhh.api.sign.SignValidation;

/**
 * 签名验证管理器
 * 
 * @author he
 * @since 1.0.0
 */
public class DefaultSignValidation implements SignValidation {
	static Logger logger = LoggerFactory.getLogger(DefaultSignValidation.class);
	
	@Override
	public boolean validation(SignBean signBean) {
		
		//todo
		logger.info("--------------"+DefaultSignValidation.class.getName());
		
		return true;
	}
}
