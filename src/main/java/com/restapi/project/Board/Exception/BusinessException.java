package com.restapi.project.Board.Exception;

import com.restapi.project.Board.Enum.ErrorCode;

import lombok.Getter;

public class BusinessException extends RuntimeException{

    @Getter
    private ErrorCode ErrorCode;

    public BusinessException(ErrorCode code) {
        this.ErrorCode = code;
    }
}
