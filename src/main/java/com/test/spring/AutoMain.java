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

         SpringHello sh = ctx.getBean(SpringHello.class);
         sh.play();
            System.out.println("test1111");
        }catch (Exception ex){
            System.out.println("test1111");
        }

    }
}
