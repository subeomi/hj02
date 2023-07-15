package com.lsb.hj02.controller;

import org.springdoc.core.annotations.ParameterObject;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lsb.hj02.dto.BoardDTO;
import com.lsb.hj02.dto.BoardListRcntDTO;
import com.lsb.hj02.dto.PageRequestDTO;
import com.lsb.hj02.dto.PageResponseDTO;
import com.lsb.hj02.service.BoardService;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@RestController
@RequestMapping("/api/board")
@RequiredArgsConstructor
@CrossOrigin
@Log4j2
public class BoardController {
    
    private final BoardService boardService;

    @GetMapping("/list")
    public PageResponseDTO<BoardListRcntDTO> list(@ParameterObject PageRequestDTO requestDTO){

        log.info(requestDTO);

        return boardService.listRcnt(requestDTO);
    }

    @GetMapping("/{bno}")
    public BoardDTO get(@PathVariable("bno") Long bno){

        log.info("Read..." + bno);

        return boardService.getOne(bno);
    }
}
