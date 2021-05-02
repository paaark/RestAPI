package com.restapi.project.Board.Enum;

import lombok.Getter;

@Getter
public enum ErrorCode {

    INVALID_PARAMETER(400, "C001001", "잘못된 접근입니다."),
    BOARD_NOT_FOUND(400,"C001002","게시글을 찾을수 없습니다."),
    BLANK_WRITER(400, "B001001", "작성자는 필수 입력 항목입니다."),
    BLANK_TITLE(400, "B001002", "제목은 필수 입력 항목입니다."),
    BLANK_CONTENT(400, "B001003", "내용은 필수 입력 항목입니다.");

    private int status;

    private String code;

    private String message;

    public int getStatus() {
        return this.status;
    }

    public String getCode() {
        return this.code;
    }

    public String getMessage() {
        return this.message;
    }

    ErrorCode(int status, String code,String message){
        this.status = status;
        this.code = code;
        this.message = message;
    }


}
