package com.luban;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @ClassName ApplicationTest
 * @Description: TODO
 * @Author zhangsc
 * @Date 2019/10/15
 * @Version V1.0
 **/
public class ApplicationTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext
                applicationContext = new AnnotationConfigApplicationContext(ApplicationTest.class);
    }
}
