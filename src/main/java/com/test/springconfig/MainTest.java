package com.test.springconfig;

import com.test.spring.SpringHello;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by liangqing on 2018/2/6.
 */
public class MainTest {
    public static void main(String [] args){
        System.out.println("222222");
        try{
//            ApplicationContext con = new ClassPathXmlApplicationContext("XMLConfigTest.xml");
//
//            ApplicationContext con1 = new AnnotationConfigApplicationContext(com.test.springconfig.ConfigTest.class);

//            SpringHello sh = (SpringHello) con.getBean("hello1");

//            sh.play();
        }catch (Exception ex){
            System.out.println("error111111111111111");
        }

    }
}
