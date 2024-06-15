package com.hutech.TruongAnhTuan_8451.validator;


import com.hutech.TruongAnhTuan_8451.annotation.ValidatorPhongBanId;
import com.hutech.TruongAnhTuan_8451.entity.PHONGBAN;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;


public class ValidPhongBanIdValidator implements ConstraintValidator<ValidatorPhongBanId, PHONGBAN> {
    @Override
    public boolean isValid(PHONGBAN phongban, ConstraintValidatorContext context) {
        return phongban != null && phongban.getId() != null;
    }
}
