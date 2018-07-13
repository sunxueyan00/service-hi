package com.forezp.service.Impl;

import com.forezp.mapper.Test5Mapper;
import com.forezp.po.Test5;
import com.forezp.service.Test5Service;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by sunxueyan on 2018/7/14.
 */
@Slf4j
@Service
public class Test5ServiceImpl implements Test5Service {
    @Autowired
    private Test5Mapper Test5Mapper;
    @Override
    public int insertTest5(Test5 Test5) {
        int insert = Test5Mapper.insert(Test5);
        return insert;
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        int i = Test5Mapper.deleteByPrimaryKey(id);
        return i;
    }

    @Override
    public Test5 selectByPrimaryKey(Integer id) {
        Test5 Test5 = Test5Mapper.selectByPrimaryKey(id);
        return Test5;
    }

    @Override
    public int updateByPrimaryKeySelective(Test5 record) {
        int i = Test5Mapper.updateByPrimaryKeySelective(record);
        return i;
    }

    @Override
    public int updateByPrimaryKey(Test5 record) {
        int i = Test5Mapper.updateByPrimaryKey(record);
        return i;
    }
}
