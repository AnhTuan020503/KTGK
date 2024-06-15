package com.hutech.TruongAnhTuan_8451.annotation;

import com.hutech.TruongAnhTuan_8451.validator.ValidPhongBanIdValidator;
import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Constraint(validatedBy = ValidPhongBanIdValidator.class)
@Target({ ElementType.TYPE })
@Retention(RetentionPolicy.RUNTIME)
public @interface ValidatorPhongBanId {
    String message() default "Invalid PhongBan ID";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
