package com.forezp.service;

import com.forezp.po.Test1;

/**
 * Created by sunxueyan on 2018/7/14.
 */
public interface Test1Service {

    int insertTest1(Test1 test1);

    int deleteByPrimaryKey(Integer id);

    Test1 selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Test1 record);

    int updateByPrimaryKey(Test1 record);

}
