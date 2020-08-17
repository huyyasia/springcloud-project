package com.huyy.springcloud.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @Author huyy
 * @Date 2020/8/13 10:23
 * @Version 1.0
 */
@Configuration
@MapperScan("com.huyy.springcloud.dao")
public class MybatisConfig {

}
