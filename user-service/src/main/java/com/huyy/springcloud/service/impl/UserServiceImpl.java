package com.huyy.springcloud.service.impl;

import com.huyy.springcloud.dao.UserMapper;
import com.huyy.springcloud.domain.User;
import com.huyy.springcloud.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author huyy
 * @Date 2020/8/11 11:29
 * @Version 1.0
 */
@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserMapper userMapper;

    @Override
    public void createUser(User user) {
        userMapper.insert(user);
    }

    @Override
    public User getUser(Integer id) {
        return userMapper.selectByPrimaryKey(id);
    }

    @Override
    public void updateUser(User user) {
        userMapper.updateByPrimaryKey(user);
    }

    @Override
    public void deleteUser(Integer id) {
        userMapper.deleteByPrimaryKey(id);
    }

    @Override
    public User getByUsername(String username) {
        return null;
    }

    @Override
    public List<User> getUserByIds(List<Long> ids) {
        return null;
    }
}
