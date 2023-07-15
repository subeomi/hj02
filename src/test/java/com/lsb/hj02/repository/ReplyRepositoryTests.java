package com.lsb.hj02.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.lsb.hj02.domain.Board;
import com.lsb.hj02.domain.Reply;

import lombok.extern.log4j.Log4j2;

@SpringBootTest
@Log4j2
public class ReplyRepositoryTests {
    
    @Autowired
    private ReplyRepository replyRepository;

    @Test
    public void testInsertR(){

        Long[] bnoArr = {200L, 199L, 197L, 195L};
        
        for(Long bno:bnoArr){
            Board board = Board.builder().bno(bno).build();

            for(int i = 0; i < 10; i++){

                Reply reply = Reply.builder()
                .replyText("Reply.."+i)
                .replyer("replyer"+i)
                .board(board)
                .build();

                replyRepository.save(reply);
            }
        }


    }
}
