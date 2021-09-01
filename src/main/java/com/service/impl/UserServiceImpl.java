package com.service.impl;

import com.mapper.UserMapper;
import com.model.User;
import com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public String selectUser(User user) {
       User user1= userMapper.selectUser(user);
       if(user1!=null){
           return "成功";
       }else{
           return "失败";
       }
    }

    @Override
    public void regist(User user) {
        userMapper.selectUser(user);
    }


}
