package com.restapi.project.Board.domain.Service;

import com.restapi.project.Board.domain.DTO.BoardDTO;
import com.restapi.project.Board.domain.DTO.MessageDTO;
import org.springframework.http.ResponseEntity;

public interface BoardService {

    public ResponseEntity<MessageDTO> registerBoard(BoardDTO boardDTO);

}
