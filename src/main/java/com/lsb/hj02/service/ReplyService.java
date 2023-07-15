package com.lsb.hj02.service;

import com.lsb.hj02.dto.PageResponseDTO;
import com.lsb.hj02.dto.ReplyDTO;
import com.lsb.hj02.dto.ReplyPageRequestDTO;

import jakarta.transaction.Transactional;

@Transactional
public interface ReplyService {
    PageResponseDTO<ReplyDTO> list(ReplyPageRequestDTO requestDTO);

    Long register(ReplyDTO replyDTO);

    ReplyDTO read(Long rno);

    void remove(Long rno);

    void modify(ReplyDTO replyDTO);
}
