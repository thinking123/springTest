package com.test.spring;

import com.test.knight.UseTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by liangqing on 2018/2/7.
 */
public class AutoMain {
    public static void main(String[] args){
        try{
            ApplicationContext ctx = new AnnotationConfigApplicationContext(HelloConfig.class);


//            ApplicationContext ctx = new ClassPathXmlApplicationContext("XMLConfigTest.xml");

         SpringHello sh = ctx.getBean(SpringHello.class);
         sh.play();


            UseTest ut = ctx.getBean(UseTest.class);
            ut.play();

            System.out.println("test1111");
        }catch (Exception ex){
            System.out.println("test2222");
            System.out.println(ex.getMessage());

        }

    }
}
