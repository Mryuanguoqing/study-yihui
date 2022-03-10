package com.git.hui.boot.mybatis;

import com.git.hui.boot.mybatis.demo.MoneyRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by @author yihui in 15:01 19/12/25.
 */
@SpringBootApplication
public class Application {

    public Application(MoneyRepository repository) {
//        repository.testResQuery();

//        repository.testV4();
        // 参数替换测试
//        repository.testArgumentReplace();
        // 位查询
//        repository.testByteQuery();

//        repository.groupBy();
//        repository.testMapper();

        // 一级缓存测试
//        repository.testFirstCache(28);

//        repository.dupQuery(28);

        // 批量插入
        repository.testBatchInsert();
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
