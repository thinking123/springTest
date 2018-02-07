package com.test.knight;

import org.springframework.stereotype.Component;

/**
 * Created by liangqing on 2018/2/6.
 */
//@Component
public class UseTest {

    private Test1 t1;

    public UseTest(Test1 t1){
        this.t1 = t1;
    }

    public void play(){
        System.out.println("in usetest play");
        t1.play();
    }
}
