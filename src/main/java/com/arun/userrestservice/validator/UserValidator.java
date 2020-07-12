package com.arun.userrestservice.validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

/**
 * @author arun on 7/12/20
 */
@Component
public abstract class UserValidator implements Validator {
    private final Validator validator;

    @Autowired
    public UserValidator(Validator userValidator) {
        this.validator = userValidator;
    }

    @Override
    public boolean supports(Class<?> clazz) {
        return true;
    }

    @Override
    public void validate(Object target, Errors errors) {
        ValidationUtils.invokeValidator(validator, target, errors);
    }
}
