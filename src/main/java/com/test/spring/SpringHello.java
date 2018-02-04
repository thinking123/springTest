package com.test.spring;


import org.springframework.stereotype.Component;

@Component
public class SpringHello implements CompactDisc{
    public void play() {
        System.out.println("this is test of spring111");
    }
}
