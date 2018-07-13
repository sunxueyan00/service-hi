package com.forezp.service;

import com.forezp.po.Test4;

/**
 * Created by sunxueyan on 2018/7/14.
 */
public interface Test4Service {

    int insertTest4(Test4 Test4);

    int deleteByPrimaryKey(Integer id);

    Test4 selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Test4 record);

    int updateByPrimaryKey(Test4 record);

}
