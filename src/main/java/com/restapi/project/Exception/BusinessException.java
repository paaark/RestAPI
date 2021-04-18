package com.restapi.project.Exception;

import com.restapi.project.domain.Enum.ErrorCode;

import lombok.Getter;

public class BusinessException extends RuntimeException{

    @Getter
    private ErrorCode ErrorCode;

    public BusinessException(ErrorCode code) {
        this.ErrorCode = code;
    }
}
