/**
 * Project Name:hhh Maven Webapp
 * File Name:MyController.java
 * Package Name:com.hhh.mvc.controller
 * Date:2016-3-21下午12:42:32
 * Copyright (c) 2016, hejiahua@sanhaodai.com All Rights Reserved.
 *
*/

package com.hhh.api.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.hhh.api.bean.UserBean;

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
	public ModelAndView hello(HttpServletRequest request){
		ModelAndView modelAndView = new ModelAndView("hellomvc");
		Map<String, Object> modelMap = new HashMap<String, Object>();
		modelMap.put("name", "hhh");
		modelMap.put("age", 43);
		modelMap.put("sex", "man");
		modelAndView.addAllObjects(modelMap);
		return modelAndView;
	}
	
	@RequestMapping("creanteUser")
	public @ResponseBody UserBean creanteUser(@RequestBody  @Valid UserBean userBean){
		return userBean;
	}
	
}

