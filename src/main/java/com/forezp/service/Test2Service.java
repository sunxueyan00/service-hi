package com.forezp.service;

import com.forezp.po.Test2;

/**
 * Created by sunxueyan on 2018/7/14.
 */
public interface Test2Service {
    
    int insertTest2(Test2 Test2);

    int deleteByPrimaryKey(Integer id);

    Test2 selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Test2 record);

    int updateByPrimaryKey(Test2 record);
    
}
