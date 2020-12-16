package com.kuang.service;

import com.kuang.dao.UserDao;
import com.kuang.dao.UserDaoImpl;

public class UserServiceImpl  implements  UserService{

    private UserDao userDao=new UserDaoImpl();
    public void getUser() {
        userDao.getUser();
    }
}
