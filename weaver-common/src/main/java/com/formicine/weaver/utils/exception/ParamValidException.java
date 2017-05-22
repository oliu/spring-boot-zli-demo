package com.formicine.weaver.utils.exception;

import org.springframework.validation.ObjectError;

import java.util.List;

public class ParamValidException extends RuntimeException {
    private List<ObjectError> objectErrors;

    public ParamValidException(List<ObjectError> objectErrors) {
        this.objectErrors = objectErrors;
    }

    public List<ObjectError> getObjectErrors() {
        return objectErrors;
    }

    public void setObjectErrors(List<ObjectError> objectErrors) {
        this.objectErrors = objectErrors;
    }
}