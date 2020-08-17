package com.huyy.springcloud.mbg;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author huyy
 * @Date 2020/8/14 9:25
 * @Version 1.0
 */
public class Generator {
    public static void main(String[] args) throws Exception{

        List<String> warnings = new ArrayList<>();
        // 覆盖原代码
        boolean overwrite = true;
        // 读取配置文件
        InputStream is = Generator.class.getResourceAsStream("/generatorConfig.xml");
        ConfigurationParser parser = new ConfigurationParser(warnings);
        Configuration configuration = parser.parseConfiguration(is);
        is.close();

        DefaultShellCallback callback = new DefaultShellCallback(overwrite);
        // 创建生成器
        MyBatisGenerator generator = new MyBatisGenerator(configuration, callback, warnings);
        // 执行代码生成
        generator.generate(null);
        // 输出告警信息
        for (String warning : warnings) {
            System.out.println(warning);
        }
    }
}
