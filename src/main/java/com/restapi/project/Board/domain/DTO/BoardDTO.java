package com.restapi.project.Board.domain.DTO;

import com.restapi.project.Board.Entity.Board;
import lombok.*;

import javax.persistence.Column;
import javax.validation.constraints.NotBlank;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
public class BoardDTO {

    private Long id;
    private String writer;
    private String title;
    private String content;
    private LocalDateTime insertDate;
    private LocalDateTime updateDate;

    public Board toEntity() {
        Board build = Board.builder()
                .id(id)
                .writer(writer)
                .title(title)
                .content(content)
                .build();
        return build;
    }

    @Builder
    public BoardDTO(Long id, String writer, String title, String content, LocalDateTime insertDate, LocalDateTime updateDate) {
        this.id = id;
        this.writer = writer;
        this.title = title;
        this.content = content;
        this.insertDate = insertDate;
        this.updateDate = updateDate;
    }


}
