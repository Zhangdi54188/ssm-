package com.controller;

import com.VO.FilmDetailm;
import com.VO.FilmVO;
import com.service.FilmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class FilmController {
    @Autowired
    private FilmService filmService;
    @RequestMapping("/queryFilm")
    public String queryFilm(Model model){
        List<FilmVO> list=filmService.selectAll();
        model.addAttribute("list",list);
        return  "list";
    }
    @RequestMapping("/detail")
    public String detail(String filmId,Model model){
        FilmDetailm detail=filmService.detail(filmId);
        model.addAttribute("detail",detail);
        return "detail";
    }

}
