package com.controller;

import com.VO.PlayVo;
import com.service.PlayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class PlayController {
    @Autowired
    private PlayService playService;
    @RequestMapping("/play")
    public String play(String filmId, Model model){
        List<PlayVo> list= playService.list(filmId);
        model.addAttribute("list",list);
        return "play";
    }
}
