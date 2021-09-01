package com.service.impl;

import com.VO.PlayVo;
import com.mapper.FilmMapper;
import com.mapper.PlayMapper;
import com.model.Film;
import com.model.Play;
import com.service.PlayService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;
@Service
public class PlayServiceImpl implements PlayService {
    @Autowired
    private PlayMapper mapper;
    @Autowired
    private FilmMapper filmMapper;
    @Override
    public List<PlayVo> list(String id) {
        List<Play> list=mapper.selectPlayAll(id);
        Film film=filmMapper.detail(id);
        List<PlayVo> list1=new ArrayList<>();
        for(Play p:list){
            PlayVo playVo=new PlayVo();
            playVo.setFilm_name(film.getFilm_name());
            BeanUtils.copyProperties(p,playVo);
            list1.add(playVo);
        }
        return list1;
    }
}
