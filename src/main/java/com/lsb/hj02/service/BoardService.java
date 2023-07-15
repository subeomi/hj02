package com.lsb.hj02.service;

import com.lsb.hj02.dto.BoardDTO;
import com.lsb.hj02.dto.BoardListRcntDTO;
import com.lsb.hj02.dto.PageRequestDTO;
import com.lsb.hj02.dto.PageResponseDTO;

import jakarta.transaction.Transactional;

@Transactional
public interface BoardService {

    PageResponseDTO<BoardListRcntDTO> listRcnt(PageRequestDTO pageRequestDTO);

    BoardDTO getOne(Long bno);
    
}
