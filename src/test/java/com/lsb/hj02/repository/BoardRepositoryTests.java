package com.lsb.hj02.repository;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.lsb.hj02.domain.Board;
import com.lsb.hj02.dto.BoardDTO;
import com.lsb.hj02.dto.BoardListRcntDTO;
import com.lsb.hj02.dto.PageRequestDTO;
import com.lsb.hj02.dto.PageResponseDTO;

import lombok.extern.log4j.Log4j2;

@SpringBootTest
@Log4j2
public class BoardRepositoryTests {

    @Autowired
    private BoardRepository boardRepository;

    @Autowired
    private ModelMapper modelMapper;

    @Test
    public void testListRcnt() {

        PageRequestDTO pageRequestDTO = new PageRequestDTO();

        PageResponseDTO<BoardListRcntDTO> responseDTO = boardRepository.searchDTORcnt(pageRequestDTO);

        log.info(responseDTO);
    }

    @Test
    public void insertB() {
        for (int i = 0; i < 100; i++) {
            Board board = Board.builder()
                    .title("Test Title" + i)
                    .content("Test Content" + i)
                    .writer("User" + (i % 10))
                    .build();

            boardRepository.save(board);
        }
    }

    @Test
    public void testRead(){
        Long bno = 200L;

        Optional<Board> result = boardRepository.findById(bno);

        Board board = result.orElseThrow();

        BoardDTO dto = modelMapper.map(board, BoardDTO.class);

        log.info(dto);
    }



}
