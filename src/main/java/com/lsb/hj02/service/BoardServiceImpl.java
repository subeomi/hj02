package com.lsb.hj02.service;

import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import com.lsb.hj02.domain.Board;
import com.lsb.hj02.dto.BoardDTO;
import com.lsb.hj02.dto.BoardListRcntDTO;
import com.lsb.hj02.dto.PageRequestDTO;
import com.lsb.hj02.dto.PageResponseDTO;
import com.lsb.hj02.repository.BoardRepository;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
@RequiredArgsConstructor
public class BoardServiceImpl implements BoardService{

    private final BoardRepository boardRepository;
    private final ModelMapper modelMapper;

    @Override
    public PageResponseDTO<BoardListRcntDTO> listRcnt(PageRequestDTO pageRequestDTO) {
        log.info("Board List Rcnt");

        return boardRepository.searchDTORcnt(pageRequestDTO);
    }

    @Override
    public BoardDTO getOne(Long bno) {
        
        Optional<Board> result = boardRepository.findById(bno);

        Board board = result.orElseThrow();

        BoardDTO dto = modelMapper.map(board, BoardDTO.class);

        return dto;
    }

    
    
}
