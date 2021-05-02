package com.restapi.project.Board.domain.Service;

import com.restapi.project.Board.Entity.Board;
import com.restapi.project.Board.Enum.ErrorCode;
import com.restapi.project.Board.Exception.BusinessException;
import com.restapi.project.Board.domain.Board.BoardRepository;
import com.restapi.project.Board.domain.DTO.BoardDTO;
import com.restapi.project.Board.domain.DTO.MessageDTO;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import javax.validation.constraints.NotBlank;
import java.util.ArrayList;
import java.util.List;

@Service
public class BoardService {

    private BoardRepository boardRepository;

    public BoardService(BoardRepository boardRepository){
        this.boardRepository = boardRepository;
    }

    @Transactional
    public Long registerBoard(BoardDTO boardDTO){
        return boardRepository.save(boardDTO.toEntity()).getId();
    }

    @Transactional
    public List<BoardDTO> getBoardList() {
        List<Board> boardList = boardRepository.findAll();
        List<BoardDTO> boardDtoList = new ArrayList<>();

        for(Board board : boardList) {
            BoardDTO boardDto = BoardDTO.builder()
                    .id(board.getId())
                    .writer(board.getWriter())
                    .title(board.getTitle())
                    .content(board.getContent())
                    .insertDate(board.getInsertDate())
                    .build();
            boardDtoList.add(boardDto);
        }
        return boardDtoList;
    }

    @Transactional
    public BoardDTO getPost(Long id) {
        Board board = boardRepository.findById(id).get();

        BoardDTO boardDto = BoardDTO.builder()
                .id(board.getId())
                .writer(board.getWriter())
                .title(board.getTitle())
                .content(board.getContent())
                .insertDate(board.getInsertDate())
                .build();
        return boardDto;
    }

    @Transactional
    public void deletePost(Long id) {
        boardRepository.deleteById(id);
    }

}
