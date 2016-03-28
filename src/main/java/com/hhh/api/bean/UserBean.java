/**
 * Project Name:hhh Maven Webapp
 * File Name:UserBean.java
 * Package Name:com.hhh.api.bean
 * Date:2016-3-26下午4:25:20
 * Copyright (c) 2016, hejiahua@sanhaodai.com All Rights Reserved.
 *
*/

package com.hhh.api.bean;
import org.hibernate.validator.constraints.NotEmpty;
import org.hibernate.validator.constraints.Range;

import com.hhh.api.sign.imp.Md5SignValidation;
import com.hhh.api.validation.Sign;

/**
 * ClassName:UserBean <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2016-3-26 下午4:25:20 <br/>
 * @author   Administrator
 * @version  
 * @since    JDK 1.6
 * @see 	 
 */
public class UserBean extends Md5Bean {
	
	@NotEmpty(message="姓名不能为空")
	private String name;
	
	@Range(min=20,max=120,message="年龄在20到120岁之间")
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
}

