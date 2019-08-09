package com.example.demo;

import java.sql.SQLException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.user.dao.UserDao;
import com.user.domain.User;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		UserDao dao = new UserDao();
		
		User user = new User();
		user.setId("samba");
		user.setName("삼바");
		user.setPassword("wavuslim");
		
		dao.add(user);
		
		System.out.println(user.getId() + "등록 성공");
		
		User user2 = dao.get(user.getId());
		System.out.println(user2.getName());
		
		
		//SpringApplication.run(DemoApplication.class, args);
	}

}
