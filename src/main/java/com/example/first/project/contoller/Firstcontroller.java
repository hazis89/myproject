package com.example.first.project.contoller;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@AllArgsConstructor
public class Firstcontroller {
    private BoardService boardService;

    @GetMapping("/")
    public String list(){
        return "board/list.html";
    }
    @GetMapping("/post")
    public String wirte(){
        return "board/write.html";
    }

    @PostMapping("/post")
    public String wirte(BoardDto boardDto){
        boardService.savePost(boardDto);

        return "redirect:/";
    }
}
