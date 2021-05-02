package com.restapi.project.Board.Controller;

import com.restapi.project.Board.domain.DTO.BoardDTO;
import com.restapi.project.Board.domain.Service.BoardService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Controller
public class PageController {

    private BoardService boardService;

    //게시판 등록 페이지
    @GetMapping(value="/board")
    public String board(){
        return "board.html";
    }

    //게시판 리스트 페이지
    @GetMapping(value="/boards")
    public String boards(Model model) {

        List<BoardDTO> boardDTOList = boardService.getBoardList();
        model.addAttribute("boardList", boardDTOList);

        return "boards.html";
    }

    //게시판 상세 페이지
    @GetMapping(value="/boards/{no}")
    public String boardsDetail(@PathVariable("id") Long id, Model model) {

        BoardDTO boardDTO = boardService.getPost(id);
        model.addAttribute("boardListDetail", boardDTO);

        return "boardsDetail.html";
    }

}
