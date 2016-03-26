/**
 * Project Name:hhh Maven Webapp
 * File Name:Response.java
 * Package Name:com.hhh.api.bean
 * Date:2016-3-26下午4:47:02
 * Copyright (c) 2016, hejiahua@sanhaodai.com All Rights Reserved.
 *
*/

package com.hhh.api.bean;
/**
 * ClassName:Response <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2016-3-26 下午4:47:02 <br/>
 * @author   Administrator
 * @version  
 * @since    JDK 1.6
 * @see 	 
 */
public class Response {
	
	private String message;
	private String code;
	private Object data;
	
	public Response failure(String msg){
		this.message = msg;
		this.code = "false";
		return this;
	}
	
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
	
	
}

