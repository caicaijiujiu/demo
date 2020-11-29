package com.caicai.demo.mapper;

import com.caicai.demo.entity.UserEntity;

import java.util.List;

public interface UserMapper {
    List<UserEntity> selectUsers();
    int deleteUser(int id);
}
