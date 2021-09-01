package com.controller;

import com.model.User;
import com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {
    @Autowired
    private UserService service;
    //用来进行登录判断
    @RequestMapping("/login")
    public String login(User user, Model model){
        String result=service.selectUser(user);
        if(result.equals("成功")){
            return "welcome";
        }else{
            model.addAttribute("result","密码或者用户名错误");
            return "first";
        }
    }
    //用来切换登录页面
    @RequestMapping("/zhu")
    public String zhuPan(){
        return "zhu";
    }
    //用来切换注册页面
    @RequestMapping("deng")
    public String deng(){
        return "first";
    }
    //用来进行注册
    @RequestMapping("/regist")
    public String zhu(User user,Model model){
      service.regist(user);
      model.addAttribute("result","注册成功");
      return "zhu";
    }
}
