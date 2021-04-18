package com.restapi.project.Exception;

import org.springframework.http.ResponseEntity;
import com.restapi.project.Response.ErrorResponse;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.restapi.project.domain.Enum.ErrorCode;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(BusinessException.class)
    public ResponseEntity<ErrorResponse> BusinessException(BusinessException e){
        ErrorResponse response = ErrorResponse.of(e.getErrorCode());
        ErrorCode code = e.getErrorCode();
        return new ResponseEntity<ErrorResponse>(response, HttpStatus.valueOf(code.getStatus()));
    }
}
