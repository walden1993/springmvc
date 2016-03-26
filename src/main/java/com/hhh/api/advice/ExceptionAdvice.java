/**
 * Project Name:hhh Maven Webapp
 * File Name:ExceptionAdvice.java
 * Package Name:com.hhh.api.advice
 * Date:2016-3-26下午4:45:22
 * Copyright (c) 2016, hejiahua@sanhaodai.com All Rights Reserved.
 *
*/

package com.hhh.api.advice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.hhh.api.bean.Response;

/**
 * ClassName:ExceptionAdvice <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2016-3-26 下午4:45:22 <br/>
 * @author   Administrator
 * @version  
 * @since    JDK 1.6
 * @see 	 
 */
@ControllerAdvice
@ResponseBody
public class ExceptionAdvice {
	
	private static Logger logger = LoggerFactory.getLogger(ExceptionAdvice.class);
	
	/**
     * 400 - Bad Request
     */
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public Response handleMethodArgumentNotValidException(MethodArgumentNotValidException e) {
        logger.error("参数验证失败", e);
        BindingResult result = e.getBindingResult();
        StringBuffer sb = new StringBuffer();
        for (ObjectError error : result.getAllErrors()) {
        	String field = error.getCode();
            String code = error.getDefaultMessage();
            String message = String.format("%s:%s", field, code);
            sb.append(message);
		}
        return new Response().failure(sb.toString());
    
    }
	
}

