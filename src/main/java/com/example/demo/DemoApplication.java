package com.example.demo;

import java.sql.SQLException;

import org.junit.runner.JUnitCore;

public class DemoApplication {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		JUnitCore.main("com.user.dao.UserDaoTest");
		
//		ApplicationContext context = new AnnotationConfigApplicationContext(DaoFactory.class);
//		
//		UserDao dao = context.getBean("userDao", UserDao.class);
//
//		CountingConnectionMaker ccm = context.getBean("connectionMaker", CountingConnectionMaker.class);
//		
//		System.out.println("Connection counter: " + ccm.getCounter());
//		  
//		User user = new User(); 
//		user.setId("samba"); user.setName("삼바");
//		user.setPassword("wavuslim");
//		
//		dao.add(user);	  
//		System.out.println(user.getId() + "등록 성공");
//		  
//		User user2 = dao.get(user.getId());
//		
//		if(!user.getName().equals(user2.getName())) {
//			System.out.println("테스트 실패 (name)");
//		}
//		
//		if(!user.getPassword().equals(user2.getPassword())) {
//			System.out.println("테스트 실패 (password)");
//		}
//		
//		System.out.println("조회 테스트 성공");
//		
//		System.out.println(user2.getName());
//		System.out.println(user2.getPassword());
//		  
//		System.out.println(user2.getId() + "조회 성공");
	}

}
