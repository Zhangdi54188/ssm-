package com.service.impl;

import com.VO.FilmVO;
import com.mapper.FilmMapper;
import com.model.Film;
import com.service.FilmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FilmServiceImpl implements FilmService {
    @Autowired
    private FilmMapper filmMapper;
    @Override
    public List<FilmVO> selectAll() {
        List<Film> filmList=filmMapper.getFilms();
        //知道长度直接给定长度，这样可以会直接创建特定长度，不用进行扩容
        List<FilmVO> filmVOS=new ArrayList<>(filmList.size());
        for(Film film:filmList){
            FilmVO filmVO=new FilmVO();
            filmVO.setFilmId(film.getFilm_id());
            filmVO.setName(film.getFilm_name());
            filmVO.setImgPath(film.getImg_path());
            filmVOS.add(filmVO);
        }
        return filmVOS;
    }
}
