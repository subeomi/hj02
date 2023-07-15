package com.lsb.hj02.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lsb.hj02.domain.Board;
import com.lsb.hj02.repository.search.BoardSearch;

public interface BoardRepository extends JpaRepository<Board, Long>, BoardSearch{
    
}
