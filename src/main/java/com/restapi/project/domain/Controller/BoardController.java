package com.restapi.project.domain.Controller;

import com.restapi.project.domain.Board.BoardDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class BoardController {

    @PostMapping(value="/board")
    public ResponseEntity<?> board(@Valid @RequestBody BoardDTO boardDTO){
        System.out.println("boardDTO : " + boardDTO);
        return true;
    }

}
