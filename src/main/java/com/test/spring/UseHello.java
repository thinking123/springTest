package com.test.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by liangqing on 2018/2/6.
 */
@Component
public class UseHello {

    private SpringHello sh;
    @Autowired
    public UseHello(SpringHello sh){
        this.sh = sh;
    }

    public void play(){
        sh.play();
    }
}
