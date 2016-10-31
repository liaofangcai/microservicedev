package com.dao;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.dao.Interface.UserDao;

/**
* @author 作者 Fangcai Liao
* @version 创建时间：Oct 26, 2016 11:36:07 AM
* 类说明
*/
@Component
public class UserDaoImp implements UserDao{

    private final Logger log = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List getByName(String name) {
        log.info("test");
        return this.jdbcTemplate.queryForList("select name from product");
    }

}
