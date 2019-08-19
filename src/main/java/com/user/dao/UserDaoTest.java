package com.user.dao;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.sql.SQLException;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.user.domain.User;

public class UserDaoTest {
	
	@Test
	public void addAndGet() throws ClassNotFoundException, SQLException {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(DaoFactory.class);
		
		UserDao dao = context.getBean("userDao", UserDao.class);
		User user = new User();
		
		user.setId("amazing");
		user.setName("임성호");
		user.setPassword("lim");
		
		dao.add(user);
		
		User user2 = dao.get(user.getId());
		
		assertThat(user2.getName(), is(user.getName()));
		assertThat(user2.getPassword(), is(user.getPassword()));
	}
}
