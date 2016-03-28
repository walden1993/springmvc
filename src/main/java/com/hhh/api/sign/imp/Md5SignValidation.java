/**
 * Project Name:hhh Maven Webapp
 * File Name:Md5SignValidation.java
 * Package Name:com.hhh.api.sign.imp
 * Date:2016-3-28上午10:12:52
 * Copyright (c) 2016, hejiahua@sanhaodai.com All Rights Reserved.
 *
*/

package com.hhh.api.sign.imp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.hhh.api.bean.SignBean;
import com.hhh.api.sign.SignValidation;

/**
 * ClassName:Md5SignValidation <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2016-3-28 上午10:12:52 <br/>
 * @author   Administrator
 * @version  
 * @since    JDK 1.6
 * @see 	 
 */
public class Md5SignValidation implements SignValidation{
	
	static Logger logger = LoggerFactory.getLogger(Md5SignValidation.class);
	
	@Override
	public boolean validation(SignBean signBean) {
		logger.info("--------------"+Md5SignValidation.class.getName());
		return false;
	}

}

