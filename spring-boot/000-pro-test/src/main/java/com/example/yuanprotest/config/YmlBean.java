package com.example.yuanprotest.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.List;
import java.util.Map;

/**
 * @author yuangq
 */
@Data
@Configuration
@PropertySource({"classpath:biz2.yml"})
@ConfigurationProperties(prefix = "biz3.yml")
public class YmlBean {
    private String type;

    private String name;

    private List<Map<String, String>> ary;
}
