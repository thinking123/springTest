package com.test.knight;

import com.test.spring.HelloConfig;
import com.test.spring.SpringHello;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class KnightMain {
    public static void main(String[] args){
        try{
//            ApplicationContext ctx = new AnnotationConfigApplicationContext(TestConfig.class);


            ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:META-INF/XMLConfigTest.xml");



            UseTest ut = ctx.getBean(UseTest.class);
            ut.play();

            System.out.println("test1111");
        }catch (Exception ex){
            System.out.println("test2222");
            System.out.println(ex.getMessage());

        }

    }
}
