package com.example.yuanprotest.config;

import com.example.yuanprotest.config.beanFactory.YmlFactory;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

/**
 * @author yuangq
 */
@Data
@Configuration
@PropertySource(value = {"classpath:biz1.yml"}, factory = YmlFactory.class)
@ConfigurationProperties(prefix = "yml1")
public class YmlBean {
    private String type;

    private String name;

    private List<Map<String, String>> ary;
}
