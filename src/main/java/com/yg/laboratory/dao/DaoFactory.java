package com.yg.laboratory.dao;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.SimpleDriverDataSource;

@Configuration
public class DaoFactory {
    @Bean
    public DataSource dataSource() {
        System.out.println("데이터 베이스 연결중1");
        SimpleDriverDataSource dataSource = new SimpleDriverDataSource ();

        dataSource.setDriverClass(org.h2.Driver.class);
        dataSource.setUrl("jdbc:h2:tcp://localhost/~/laboratory");
        dataSource.setUsername("sa");
//        dataSource.setPassword("");

        return dataSource;
    }

    @Bean
    public UserDao userDao() {
        UserDao userDao = new UserDao();
        userDao.setDataSource(dataSource());
        return userDao;
    }
}
