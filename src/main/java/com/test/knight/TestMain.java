package com.test.knight;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by liangqing on 2018/2/6.
 */
public class TestMain {
    public static void main(String[] args){
        try{
            System.out.println("11111111111111111111111111111111111111111111111");
            ClassPathXmlApplicationContext con = new ClassPathXmlApplicationContext("META-INF/test1.xml");
            System.out.println("2222222");
            UseTest ut = con.getBean(UseTest.class);

            ut.play();

//            con.close();
            System.out.println("test1111");
        }catch (Exception ex){
            System.out.println("test1111");
        }

    }
}
