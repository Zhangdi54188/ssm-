package com.mapper;

import com.model.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {
    int deleteByPrimaryKey(Long id);

    int insert(User record);

    User selectByPrimaryKey(Long id);

    List<User> selectAll();

    User selectUser(@Param("user") User user);

    int updateByPrimaryKey(User record);
    void register(User user);
}