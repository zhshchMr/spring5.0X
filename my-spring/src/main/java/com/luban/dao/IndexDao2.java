package com.luban.dao;

import org.springframework.stereotype.Component;

/**
 * @ClassName IndexDao2
 * @Description: TODO
 * @Author zhangsc
 * @Date 2019/10/18
 * @Version V1.0
 **/
@Component
public class IndexDao2 implements Dao{
    @Override
    public void query() {
        System.out.println("indexDao2");
    }
}
