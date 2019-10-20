package com.luban.dao;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import java.lang.reflect.Proxy;

/**
 * @ClassName IndexDaoBeanProcessor
 * @Description: TODO
 * @Author zhangsc
 * @Date 2019/10/18
 * @Version V1.0
 **/
public class IndexDaoBeanProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if (beanName.equals("indexDaoImpl")){
            System.out.println("代理了indexDao");
            bean = Proxy.newProxyInstance(this.getClass().getClassLoader(),
                    new Class[]{Dao.class},new IndexProxy(bean));
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        return null;
    }
}
