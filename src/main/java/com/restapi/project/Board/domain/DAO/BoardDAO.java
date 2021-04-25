package com.restapi.project.Board.domain.DAO;

import com.restapi.project.Board.domain.DTO.BoardDTO;
import com.restapi.project.Board.domain.DTO.MessageDTO;
import org.springframework.http.ResponseEntity;

public interface BoardDAO {

    public ResponseEntity<MessageDTO> registerBoard(BoardDTO boardDTO);

}
