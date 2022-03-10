package com.example.yuanprotest.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Data
@Configuration
@PropertySource({"classpath:application.properties"})
@ConfigurationProperties(prefix = "app.proper")
public class ProperBean {

    private String key;

    private String id;
    
    private String value;
}
