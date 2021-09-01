package com.mapper;

import com.model.Play;
import java.util.List;

public interface PlayMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Play record);

    Play selectByPrimaryKey(Long id);

    List<Play> selectAll();
    List<Play> selectPlayAll(String id);

    int updateByPrimaryKey(Play record);
}