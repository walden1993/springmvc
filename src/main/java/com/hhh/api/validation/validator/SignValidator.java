package com.hhh.api.validation.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.hhh.api.bean.SignBean;
import com.hhh.api.sign.SignValidation;
import com.hhh.api.sign.imp.DefaultSignValidation;
import com.hhh.api.validation.Sign;

/**
 * 等于长度注解验证器
 *
 * @author he
 * @since 1.0.0
 */
public class SignValidator implements ConstraintValidator<Sign, SignBean> {
	
	private static Logger logger = LoggerFactory.getLogger(SignValidator.class);
	
    private SignValidation signValidation;

    @Override
    public void initialize(Sign constraintAnnotation) {
    	try {
    		signValidation =  constraintAnnotation.value().newInstance();
		} catch (InstantiationException e) {
			logger.error(e.getMessage()+":实例化签名管理器失败。");
		} catch (IllegalAccessException e) {
			logger.error(e.getMessage()+":实例化签名管理器失败。");
		}finally{
			if (signValidation == null) {
				signValidation = new DefaultSignValidation();
			}
		}
    }

	@Override
	public boolean isValid(SignBean value, ConstraintValidatorContext context) {
		return signValidation.validation(value);
	}
}
