package com.example.demo;

import java.sql.SQLException;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.user.dao.ConnectionMaker;
import com.user.dao.DConnectionMaker;
import com.user.dao.DaoFactory;
import com.user.dao.UserDao;
import com.user.domain.User;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		// SpringApplication.run(DemoApplication.class, args);
		
		UserDao dao = new DaoFactory().userDao();
		  
		User user = new User(); 
		user.setId("samba"); user.setName("삼바");
		user.setPassword("wavuslim");
		  
		dao.add(user);
		  
		System.out.println(user.getId() + "등록 성공");
		  
		User user2 = dao.get(user.getId()); System.out.println(user2.getName());
		System.out.println(user2.getPassword());
		  
		System.out.println(user2.getId() + "조회 성공");
		
	}

}
