package com.restapi.project.Board.Response;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import com.restapi.project.Board.Enum.ErrorCode;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class ErrorResponse {

    private String message;
    private int status;
    private String code;

    public ErrorResponse(ErrorCode code) {
        this.status = code.getStatus();
        this.code = code.getCode();
        this.message = code.getMessage();
    }

    public static ErrorResponse of(ErrorCode errorCode) {
        // TODO Auto-generated method stub
        return new ErrorResponse(errorCode);
    }

}
