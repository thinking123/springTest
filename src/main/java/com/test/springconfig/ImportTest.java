package com.test.springconfig;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

/**
 * Created by liangqing on 2018/2/6.
 */
@Configuration
@Import({JavaConfigTest.class})
@ImportResource("classpath:XMLConfigTest.xml")
public class ImportTest {
}
