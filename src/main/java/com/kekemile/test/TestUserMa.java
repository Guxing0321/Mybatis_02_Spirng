package com.kekemile.test;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.kekemile.dao.UserDao;
import com.kekemile.po.User;

public class TestUserMa {

	/*
	 * private ApplicationContext cx = null;
	 * 
	 * @Before public void initSqlSession01() throws Exception { String reource
	 * = "classpath:Spring/ApplicationContext.xml";
	 * 
	 * cx = new ClassPathXmlApplicationContext(reource);
	 * 
	 * }
	 */

	private ApplicationContext applicatonContext;

	@Before
	public void setUp() throws Exception {
		String configLocation = "classpath:Spring/ApplicationContext.xml";
		applicatonContext = new ClassPathXmlApplicationContext(configLocation);
	}

	@Test
	public void Test01() {
		UserDao ud = (UserDao) applicatonContext.getBean("userDao");
		User u = ud.FindUserById(1);
		System.out.println(u);
	}

}
