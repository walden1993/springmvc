/**
 * Project Name:hhh Maven Webapp
 * File Name:Md5Bean.java
 * Package Name:com.hhh.api.bean
 * Date:2016-3-28上午11:02:07
 * Copyright (c) 2016, hejiahua@sanhaodai.com All Rights Reserved.
 *
*/

package com.hhh.api.bean;

import com.hhh.api.sign.imp.Md5SignValidation;
import com.hhh.api.validation.Sign;

/**
 * ClassName:Md5Bean <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2016-3-28 上午11:02:07 <br/>
 * @author   Administrator
 * @version  
 * @since    JDK 1.6
 * @see 	 
 */
@Sign(message="md5验证失败",value=Md5SignValidation.class)
public class Md5Bean extends SignBean{
	//专属验证字段
}

