package com.forezp.service.Impl;

import com.forezp.mapper.Test1Mapper;
import com.forezp.po.Test1;
import com.forezp.service.Test1Service;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by sunxueyan on 2018/7/14.
 */
@Slf4j
@Service
public class Test1ServiceImpl implements Test1Service {
    @Autowired
    private Test1Mapper test1Mapper;
    @Override
    public int insertTest1(Test1 test1) {
        int insert = test1Mapper.insert(test1);
        return insert;
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        int i = test1Mapper.deleteByPrimaryKey(id);
        return i;
    }

    @Override
    public Test1 selectByPrimaryKey(Integer id) {
        Test1 test1 = test1Mapper.selectByPrimaryKey(id);
        return test1;
    }

    @Override
    public int updateByPrimaryKeySelective(Test1 record) {
        int i = test1Mapper.updateByPrimaryKeySelective(record);
        return i;
    }

    @Override
    public int updateByPrimaryKey(Test1 record) {
        int i = test1Mapper.updateByPrimaryKey(record);
        return i;
    }
}
