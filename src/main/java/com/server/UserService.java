package com.server;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.UserDaoImp;

/**
* @author 作者 Fangcai Liao
* @version 创建时间：Oct 26, 2016 11:16:00 AM
* 类说明
*/
@Service
public class UserService {

    @Autowired
    UserDaoImp userDaoImp;

    public List getByName(String name) {
        return userDaoImp.getByName(name);
    }
}
