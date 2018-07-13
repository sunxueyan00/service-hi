package com.forezp.service.Impl;

import com.forezp.mapper.Test2Mapper;
import com.forezp.po.Test2;
import com.forezp.service.Test2Service;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by sunxueyan on 2018/7/14.
 */
@Slf4j
@Service
public class Test2ServiceImpl implements Test2Service {
    @Autowired
    private Test2Mapper Test2Mapper;
    @Override
    public int insertTest2(Test2 Test2) {
        int insert = Test2Mapper.insert(Test2);
        return insert;
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        int i = Test2Mapper.deleteByPrimaryKey(id);
        return i;
    }

    @Override
    public Test2 selectByPrimaryKey(Integer id) {
        Test2 Test2 = Test2Mapper.selectByPrimaryKey(id);
        return Test2;
    }

    @Override
    public int updateByPrimaryKeySelective(Test2 record) {
        int i = Test2Mapper.updateByPrimaryKeySelective(record);
        return i;
    }

    @Override
    public int updateByPrimaryKey(Test2 record) {
        int i = Test2Mapper.updateByPrimaryKey(record);
        return i;
    }
}
