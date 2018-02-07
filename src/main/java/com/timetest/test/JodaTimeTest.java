package com.timetest.test;

import org.joda.time.Chronology;
import org.joda.time.chrono.CopticChronology;

/**
 * Created by liangqing on 2018/2/7.
 */
public class JodaTimeTest {
    public static void main(String[] args) throws Exception{
        Chronology coptic = CopticChronology.getInstance();

        System.out.println("ttest 111");

    }
}
