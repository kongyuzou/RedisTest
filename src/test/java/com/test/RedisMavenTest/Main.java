package com.test.RedisMavenTest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.test.dao.UserDao;
import com.test.obj.User;

public class Main{
public static void main(String[] args) {
    ApplicationContext ac =  new ClassPathXmlApplicationContext("classpath:/applicationContext.xml");
    UserDao userDAO = (UserDao)ac.getBean("userDao");
    User user1 = new User();
    user1.setId(1);
    user1.setName("Jack");
    userDAO.saveUser(user1);
    User user3 = userDAO.getUser(1);
    System.out.println(user3.getName());
}
}