package com.fh.sunss.api.service.impl;

import com.fh.sunss.api.dao.UserDao;
import com.fh.sunss.api.entity.po.User;
import com.fh.sunss.api.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceimpl implements UserService {

    @Resource
    private UserDao  userDao;

    @Override
    public List<User> queryUserList(List fieldNameList) {
        return userDao.queryUserList(fieldNameList);
    }

    @Override
    public void addUser(User user) {
        userDao.insert(user);
    }
}
