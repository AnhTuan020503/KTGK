package com.hutech.TruongAnhTuan_8451.annotation;

import com.hutech.TruongAnhTuan_8451.validator.ValidUserIdValidator;
import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = ValidUserIdValidator.class)
@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface ValidUserId {
    String message() default "Invalid User ID";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
