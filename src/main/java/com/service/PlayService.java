package com.service;

import com.VO.PlayVo;

import java.util.List;

public interface PlayService {
    List<PlayVo> list(String film_id);
}
