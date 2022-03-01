package com.example.first.project.board.service.Board;

import com.example.first.project.contoller.BoardDto;
import lombok.AllArgsConstructor;

import javax.transaction.Transactional;

@AllArgsConstructor
@org.springframework.stereotype.Service


public class Service {
    private BoardRepository boardRepository;
    
    @Transactional
    public Long savePost(BoardDto boardDto){
        return boardRepository.save(boardDto.toEntity()).getId();
    }
    
}
    

