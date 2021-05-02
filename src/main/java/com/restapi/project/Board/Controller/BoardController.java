package com.restapi.project.Board.Controller;

import com.restapi.project.Board.domain.Service.BoardService;
import com.restapi.project.Board.domain.DTO.BoardDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
public class BoardController {

    @Autowired
    private BoardService BoardService;

    @PostMapping(value="/board")
    public String write(BoardDTO boardDTO){
        System.out.println("boardDTO : " + boardDTO);

        BoardService.registerBoard(boardDTO);

        return "redirect:/boards";
    }

    @GetMapping("/board/edit/{id}")
    public String edit(@PathVariable("id") Long id, Model model){

        BoardDTO boardDTO = BoardService.getPost(id);
        model.addAttribute("board", boardDTO);
        return "edit.html";
    }


    @PutMapping("/board/edit/{id}")
    public String update(BoardDTO boardDTO){

        BoardService.registerBoard(boardDTO);

        return "redirect:/boards";
    }

    @DeleteMapping("/post/{id}")
    public String delete(@PathVariable("id") Long id) {
        BoardService.deletePost(id);
        return "redirect:/boards";
    }

}
