package com.lsb.hj02.dto;

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
public class ReplyDTO {
    
    private Long rno;
    private String replyer;
    private String replyText;
    private String replyFile;
    private Long bno;

}
