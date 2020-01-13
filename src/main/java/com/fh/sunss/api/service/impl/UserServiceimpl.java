package com.fh.sunss.api.service.impl;

import com.fh.sunss.api.dao.UserDao;
import com.fh.sunss.api.entity.po.User;
import com.fh.sunss.api.entity.vo.BaseDate;
import com.fh.sunss.api.entity.vo.UserSeach;
import com.fh.sunss.api.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Arrays;
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

    @Override
    public BaseDate queryUserListPaging(UserSeach us) {
        long lo=userDao.queryCountUser();
        List<User> userList=userDao.queryUserListPaging(us);
        BaseDate<User> bd=new BaseDate<>();
        bd.setData(userList);
        bd.setDraw(us.getDraw());
        bd.setRecordsFiltered((int)lo);
        bd.setRecordsTotal((int)lo);
        return bd;
    }

    @Override
    public User queryUserByid(Integer id) {
        return userDao.selectById(id);
    }

    @Override
    public void updateUser(User user) {
        userDao.updateById(user);
    }

    @Override
    public void deleteUser(String[] id) {
        userDao.deleteBatchIds(Arrays.asList(id));
    }

    @Override
    public List<User> queryUserAllList() {
        return userDao.selectList(null);
    }
}
