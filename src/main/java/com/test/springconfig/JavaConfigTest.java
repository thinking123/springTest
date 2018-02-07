package com.test.springconfig;

import com.test.spring.CompactDisc;
import com.test.spring.SpringHello;
import com.test.spring.SpringHello1;
import org.springframework.context.annotation.Bean;

/**
 * Created by liangqing on 2018/2/6.
 */
public class JavaConfigTest {

    @Bean
    public CompactDisc springHello(){
        return new SpringHello();
    }

    @Bean("springHello1Test")
    public CompactDisc springHello1(){
        return new SpringHello1();
    }
}
