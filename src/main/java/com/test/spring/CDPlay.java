package com.test.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.inject.Inject;
import javax.inject.Named;

/**
 * Created by liangqing on 2018/2/6.
 */
@Named("mycdplay")
@Component
public class CDPlay {

    private SpringHello sh;
    private SpringHello1 sh1;
    private SpringHello3 sh3;
    @Autowired
    public void setSpringHello1(SpringHello1 sh1){
        this.sh1 = sh1;
    }


    @Inject
    public void setSpringHello1(SpringHello3 sh3){
        this.sh3 = sh3;
    }
    @Autowired
    public CDPlay(SpringHello sh){
        this.sh = sh;
    }

    public void playCD(){
        sh.play();
        sh1.play();
    }




}
