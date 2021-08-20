package com.service;

import com.VO.FilmDetailm;
import com.VO.FilmVO;

import java.util.List;

public interface FilmService {
    List<FilmVO> selectAll();
    FilmDetailm detail(String filmId);
}
