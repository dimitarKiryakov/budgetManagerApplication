package com.budget.manager;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.budget.data.entity.User;
import com.budget.data.repository.UserRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ManagerApplicationTests {

	@Autowired
	UserRepository user;
	
	@Test
	public void contextLoads() {
		User dimitar = new User();
		dimitar.setUsername("Test");
		user.save(dimitar);
	}

}

