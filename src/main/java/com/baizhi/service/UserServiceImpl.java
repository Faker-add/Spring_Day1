package com.baizhi.service;

import com.baizhi.dao.UserDAO;

public class UserServiceImpl implements  UserService {
   private  UserDAO  userDAO; //

    public void setUserDAO(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    @Override
    public void register() {
        //调用DAO
        userDAO.save();
    }
}
