package com.test.spring;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by liangqing on 2018/2/7.
 */
@Configuration
@ComponentScan(basePackages = {"com.test.spring","com.test.knight"})
public class HelloConfig {
}
