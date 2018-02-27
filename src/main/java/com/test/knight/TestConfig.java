package com.test.knight;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * Created by liangqing on 2018/2/6.
 */
@Configuration
@ImportResource("classpath:META-INF/XMLConfigTest.xml")
public class TestConfig {
//    @Bean
//    public Test1 test1(){
//        return new Test1();
//    }
//
//    @Bean
//    public UseTest useTest(Test1 t1){
//        return new UseTest(t1);
//    }
}
