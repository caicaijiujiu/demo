package com.caicai.demo;

import com.caicai.demo.entity.UserEntity;
import com.caicai.demo.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class DemoApplicationTests {

	@Autowired
	private UserMapper mapper;

	@Test
	void contextLoads() {

		List<UserEntity> entities = mapper.selectUsers();

		System.out.println(entities.toString());
	}

	@Test
	void contextLoads2() {

		int i = mapper.deleteUser(1);
		System.out.println("----------:"+i);
	}

}
