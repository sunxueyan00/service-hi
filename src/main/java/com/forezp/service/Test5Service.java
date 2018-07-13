package com.forezp.service;

import com.forezp.po.Test5;

/**
 * Created by sunxueyan on 2018/7/14.
 */
public interface Test5Service {

    int insertTest5(Test5 Test5);

    int deleteByPrimaryKey(Integer id);

    Test5 selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Test5 record);

    int updateByPrimaryKey(Test5 record);

}
