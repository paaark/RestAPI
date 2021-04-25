package com.restapi.project.Board.domain.DTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.validation.constraints.NotBlank;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class BoardDTO {

    @Column(nullable = false)
    private String writer;

    @NotBlank(message="제목은 필수입니다.")
    @Column(length = 500, nullable = false)
    private String title;

    @NotBlank(message="내용은 필수입니다.")
    @Column(length = 1000, nullable = false)
    private String content;

    private LocalDateTime insertDate;

}
