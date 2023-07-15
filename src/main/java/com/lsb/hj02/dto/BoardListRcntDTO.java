package com.lsb.hj02.dto;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class BoardListRcntDTO {
    
    private Long bno;
    private String title;
    private String writer;
    private LocalDateTime regDate;
    private long replyCount;

}
