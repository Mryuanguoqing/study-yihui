package com.example.yuanprotest.controller;

import com.example.yuanprotest.config.ProperBean;
import com.example.yuanprotest.config.YmlBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * @author admin
 */
@RestController
public class TestController {

    @Autowired
    private ProperBean properBean;

    @Autowired
    private YmlBean ymlBean;

    @RequestMapping("show")
    public String show(){
        System.out.println(properBean.toString());
        System.out.println(properBean.getId());
        List<Map<String, String>> ary = ymlBean.getAry();
        System.out.println(ary.get(0));
        return "hello world";
    }
}
