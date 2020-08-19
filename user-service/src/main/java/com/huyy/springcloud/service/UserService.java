package com.huyy.springcloud.service;

import com.huyy.springcloud.domain.User;

import java.util.List;

/**
 * @Author huyy
 * @Date 2020/8/11 11:27
 * @Version 1.0
 */
public interface UserService {

    void createUser(User user);

    User getUser(Integer id);

    void updateUser(User user);

    void deleteUser(Integer id);

    User getByUsername(String username);

    List<User> getUserByIds(List<Integer> ids);

}
