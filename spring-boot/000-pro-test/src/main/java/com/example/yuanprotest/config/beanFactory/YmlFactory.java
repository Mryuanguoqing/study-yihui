package com.example.yuanprotest.config.beanFactory;

import org.springframework.boot.env.YamlPropertySourceLoader;
import org.springframework.core.env.PropertySource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.DefaultPropertySourceFactory;
import org.springframework.core.io.support.EncodedResource;

import java.io.IOException;
import java.util.List;

/**
* @Description:
* @Author: yuangq
* @Date: 2022/3/10
* @Time: 16:08
*/
public class YmlFactory extends DefaultPropertySourceFactory {
    @Override
    public PropertySource<?> createPropertySource(String name, EncodedResource resource) throws IOException {
        if(null == resource){
            return super.createPropertySource(name, resource);
        }
        String filename = resource.getResource().getFilename();
        Resource resource1 = resource.getResource();
        List<PropertySource<?>> load = new YamlPropertySourceLoader().load(resource.getResource().getFilename(), resource.getResource());
        return load.get(0);
    }
}
