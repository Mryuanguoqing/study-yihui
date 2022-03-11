package com.example.yuanprotest.config;

import com.example.yuanprotest.config.beanFactory.YmlFactory;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.List;
import java.util.Map;

/**
 * @describe: 描述
 * @auth: yuangq
 * @date: 2022/3/11 11:09
 */
@Data
@Configuration
@PropertySource(value = {"classpath:biz3.yml"}, factory = YmlFactory.class)
@ConfigurationProperties(prefix = "yml3")
public class Yml3Bean {

    private String type;

    private String name;

    private List<Map<String, String>> ary;
}
