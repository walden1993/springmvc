/**
 * Project Name:hhh Maven Webapp
 * File Name:MyController.java
 * Package Name:com.hhh.mvc.controller
 * Date:2016-3-21下午12:42:32
 * Copyright (c) 2016, hejiahua@sanhaodai.com All Rights Reserved.
 *
*/

package com.hhh.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * ClassName:MyController <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2016-3-21 下午12:42:32 <br/>
 * @author   Administrator
 * @version  
 * @since    JDK 1.6
 * @see 	 
 */
@Controller
public class MyController {
	
	@RequestMapping("hello")
	public String hello(){
		return "hellomvc";
	}
	
}

