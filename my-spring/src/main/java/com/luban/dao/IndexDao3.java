package com.luban.dao;

import org.springframework.stereotype.Component;

/**
 * @ClassName IndexDao3
 * @Description: TODO
 * @Author zhangsc
 * @Date 2019/10/20
 * @Version V1.0
 **/
@Component
public class IndexDao3 implements Dao{
    @Override
    public void query() {
        System.out.println("indexDao3");
    }
}
