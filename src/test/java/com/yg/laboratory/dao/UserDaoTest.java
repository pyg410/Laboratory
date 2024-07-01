package com.yg.laboratory.dao;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "file:/applicationContext.xml")
public class UserDaoTest {

    @Autowired
    private ApplicationContext context;

    private UserDao dao;

    @Before
    public void setUp(){
        this.dao = context.getBean("userDao", UserDao.class);
    }

    @Test
    public void userDao_test(){
        System.out.println("테스트중!");
    }




}
