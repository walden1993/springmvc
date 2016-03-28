package com.hhh.api.validation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.persistence.Inheritance;
import javax.validation.Constraint;
import javax.validation.Payload;
import com.hhh.api.sign.SignValidation;
import com.hhh.api.sign.imp.DefaultSignValidation;
import com.hhh.api.validation.validator.SignValidator;

/**
 * 验签注解
 *
 * @author he
 * @since 1.0.0
 */
@Inherited
@Documented
@Target({ElementType.METHOD, ElementType.PARAMETER,ElementType.FIELD,ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = SignValidator.class)
public @interface Sign {

    String message() default "sign validation is fail";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
    
    Class<? extends SignValidation> value() default DefaultSignValidation.class;
}
