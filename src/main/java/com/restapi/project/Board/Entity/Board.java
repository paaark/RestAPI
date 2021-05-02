package com.restapi.project.Board.Entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Board {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;

    @Column(length = 500, nullable = false)
    private String title;

    @Column(length = 5000, nullable = false)
    private String content;

    @Column(nullable = false)
    private String writer;

    @CreatedDate
    @Column(updatable = false)
    private LocalDateTime insertDate;

    @LastModifiedDate
    private LocalDateTime updateDate;

    @Builder
    public Board(Long id,String title, String content, String writer){
        this.id = id;
        this.title = title;
        this.content = content;
        this.writer = writer;
    }

}
