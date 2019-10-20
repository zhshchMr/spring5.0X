package com.luban.dao;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @ClassName IndexProxy
 * @Description: TODO
 * @Author zhangsc
 * @Date 2019/10/18
 * @Version V1.0
 **/
public class IndexProxy implements InvocationHandler {

    private Object object;

    public IndexProxy(Object object) {
        this.object = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return method.invoke(object,args);
    }

}
