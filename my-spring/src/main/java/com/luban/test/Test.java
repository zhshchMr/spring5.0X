package com.luban.test;

import com.luban.config.AppConfig;
import com.luban.dao.Dao;
import com.luban.dao.IndexDao2;
import com.luban.service.IndexService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.DependsOn;

/**
 * @ClassName Test
 * @Description: TODO
 * @Author zhangsc
 * @Date 2019/10/15
 * @Version V1.0
 **/

public class Test {
    public static void main(String[] args) {
        /**
         * Spring 总体流程
         * 1、scan(扫描)
         * 2、parse(解析)----  类(class文件)-->beanDefinition----->存到 map(beanName,beanDefinition)
         * 3、validate(验证)-  循环上面的map，验证是否单例、原型、懒加载之类的等等
         * 4、life(生命周期)----遍历map  得到beanDefinition  得到bean  进行实例化
         */
        AnnotationConfigApplicationContext
                aa = new AnnotationConfigApplicationContext(AppConfig.class);
        IndexService IndexService = (IndexService) aa.getBean("indexService");
        IndexService.query();
    }
}
