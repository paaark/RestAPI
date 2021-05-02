package com.restapi.project.Board.domain.Board;

import com.restapi.project.Board.Entity.Board;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface BoardRepository extends JpaRepository<Board, Long> {

}
