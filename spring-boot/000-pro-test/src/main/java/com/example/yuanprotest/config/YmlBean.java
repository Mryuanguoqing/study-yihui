package com.example.yuanprotest.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

/**
 * @author yuangq
 */
@Data
@Component
@ConfigurationProperties(prefix = "yml")
public class YmlBean {
    private String type;

    private String name;

    private List<Map<String, String>> ary;
}
