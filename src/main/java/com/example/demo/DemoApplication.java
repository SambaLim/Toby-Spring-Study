package com.example.demo;

import java.sql.SQLException;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.user.dao.ConnectionMaker;
import com.user.dao.CountingConnectionMaker;
import com.user.dao.DConnectionMaker;
import com.user.dao.DaoFactory;
import com.user.dao.UserDao;
import com.user.domain.User;

public class DemoApplication {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(DaoFactory.class);
		
		UserDao dao = context.getBean("userDao", UserDao.class);

		CountingConnectionMaker ccm = context.getBean("connectionmaker", CountingConnectionMaker.class);
		
		System.out.println("Connection counter: " + ccm.getCounter());
		  
//		User user = new User(); 
//		user.setId("samba"); user.setName("삼바");
//		user.setPassword("wavuslim");
//		  
//		dao.add(user);
//		  
//		System.out.println(user.getId() + "등록 성공");
//		  
//		User user2 = dao.get(user.getId()); System.out.println(user2.getName());
//		System.out.println(user2.getPassword());
//		  
//		System.out.println(user2.getId() + "조회 성공");
//		
	}

}
