package com.forezp.service;

import com.forezp.po.Test3;

/**
 * Created by sunxueyan on 2018/7/14.
 */
public interface Test3Service {

    int insertTest3(Test3 Test3);

    int deleteByPrimaryKey(Integer id);

    Test3 selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Test3 record);

    int updateByPrimaryKey(Test3 record);

}
