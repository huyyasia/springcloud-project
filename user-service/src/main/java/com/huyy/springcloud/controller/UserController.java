package com.huyy.springcloud.controller;

import com.huyy.springcloud.domain.CommonResult;
import com.huyy.springcloud.domain.User;
import com.huyy.springcloud.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author huyy
 * @Date 2020/8/11 10:42
 * @Version 1.0
 */
@RestController
@RequestMapping("/user")
public class UserController {

    private Logger LOGGER = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private UserService userService;

    @PostMapping("/create")
    public CommonResult create(@RequestBody User user) {
        userService.createUser(user);
        return new CommonResult("操作成功", 200);
    }

    @GetMapping("/{id}")
    public CommonResult<User> getUser(@PathVariable Integer id) {
        User user = userService.getUser(id);
        LOGGER.info("根据id获取用户信息，用户名为{}", user.getUsername());
        return new CommonResult<>(user);
    }

    @GetMapping("/getUserByIds")
    public CommonResult<List<User>> getUserByIds(@RequestParam List<Integer> ids) {
        List<User> userList = userService.getUserByIds(ids);

        return new CommonResult<>(userList);
    }

}
