package com.caicai.demo.service.impl;

import com.caicai.demo.entity.UserEntity;
import com.caicai.demo.mapper.UserMapper;
import com.caicai.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper mapper;


    @Override
    public List<UserEntity> getUsers() {
        return mapper.selectUsers();
    }
}
