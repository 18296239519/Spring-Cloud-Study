package com.jt;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.jt.pojo.User;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SSMTest {
	
	@Test
	public void userTest() {
		User user = new User();
		user.setAge(5);
		user.setName("wangwu");
		User user1 = new User();
		user1.setAge(5);
		user1.setName("wangwu");
		System.out.println(user == user1);
		System.out.println(user.equals(user1));
		
		
	}
}
