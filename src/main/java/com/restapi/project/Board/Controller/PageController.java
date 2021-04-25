package com.restapi.project.Board.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {

    //게시판 등록 페이지
    @GetMapping(value="/board")
    public String board(){
        return "board";
    }

    //게시판 리스트 페이지
    @GetMapping(value="/boards")
    public String boards() {
        return "boards";
    }

    //게시판 상세 페이지
    @GetMapping(value="/boards/{no}")
    public String boardsDetail() {
        return "boardsDetail";
    }

}
