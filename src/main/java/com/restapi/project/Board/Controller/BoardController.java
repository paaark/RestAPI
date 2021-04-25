package com.restapi.project.Board.Controller;

import com.restapi.project.Board.domain.Service.BoardService;
import com.restapi.project.Board.domain.DTO.BoardDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class BoardController {

    @Autowired
    private BoardService BoardService;

    @PostMapping(value="/board")
    public ResponseEntity<?> board(@Valid @RequestBody BoardDTO boardDTO){
        System.out.println("boardDTO : " + boardDTO);

        return BoardService.registerBoard(boardDTO);
    }

}
