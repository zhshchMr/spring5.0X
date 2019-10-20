package com.luban.service;

import com.luban.dao.Dao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Map;

/**
 * @ClassName IndexService
 * @Description: TODO
 * @Author zhangsc
 * @Date 2019/10/20
 * @Version V1.0
 **/
@Service
public class IndexService {
    @Resource
    private Map<String,Dao> map;


    public void query(){
        map.get("indexDao2").query();
    }
}
