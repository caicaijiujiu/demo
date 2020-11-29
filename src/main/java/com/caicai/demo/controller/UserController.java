package com.caicai.demo.controller;

import com.caicai.demo.bean.ResultBean;
import com.caicai.demo.entity.UserEntity;
import com.caicai.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("list")
    public ResultBean<List<UserEntity>> users(){
        return new ResultBean<>(userService.getUsers());
    }

    @PostMapping("login")
    public UserEntity login(String phone, String password){
        return null;
    }
}
