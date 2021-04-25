package com.restapi.project.Board.domain.ServiceImpl;

import com.restapi.project.Board.Enum.ErrorCode;
import com.restapi.project.Board.Exception.BusinessException;
import com.restapi.project.Board.domain.Service.BoardService;
import com.restapi.project.Board.domain.DTO.BoardDTO;
import com.restapi.project.Board.domain.DTO.MessageDTO;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service("BoardService")
public class BoardServiceImpl implements BoardService {

    public ResponseEntity<MessageDTO> registerBoard(BoardDTO boardDTO) {

        HttpHeaders headers = new HttpHeaders();

        validContentDuplicate(boardDTO.getContent());
        validTitleDuplicate(boardDTO.getTitle());
        validWriterDuplicate(boardDTO.getWriter());

        return ResponseEntity.status(HttpStatus.OK)
                .header("Location", "/board")
                .body(getMessage("정상적으로 회원가입 되셨습니다."));

    }

    private MessageDTO getMessage(String getMessage) {
        MessageDTO message = MessageDTO.builder().message(getMessage).build();
        return message;
    }

    private void validWriterDuplicate(BoardDTO boardDTO) {
        if(boardDTO.getWriter() == null)
            throw new BusinessException(ErrorCode.BLANK_WRITER);
    }

    private void validTitleDuplicate(BoardDTO boardDTO) {
        if(boardDTO.getTitle() == null)
            throw new BusinessException(ErrorCode.BLANK_TITLE);
    }

    private void validContentDuplicate(BoardDTO boardDTO) {
        if(boardDTO.getContent() == null)
            throw new BusinessException(ErrorCode.BLANK_CONTENT);
    }



}
