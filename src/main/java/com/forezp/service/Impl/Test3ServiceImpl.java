package com.forezp.service.Impl;

import com.forezp.mapper.Test3Mapper;
import com.forezp.po.Test3;
import com.forezp.service.Test3Service;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by sunxueyan on 2018/7/14.
 */
@Slf4j
@Service
public class Test3ServiceImpl implements Test3Service {
    @Autowired
    private Test3Mapper Test3Mapper;
    @Override
    public int insertTest3(Test3 Test3) {
        int insert = Test3Mapper.insert(Test3);
        return insert;
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        int i = Test3Mapper.deleteByPrimaryKey(id);
        return i;
    }

    @Override
    public Test3 selectByPrimaryKey(Integer id) {
        Test3 Test3 = Test3Mapper.selectByPrimaryKey(id);
        return Test3;
    }

    @Override
    public int updateByPrimaryKeySelective(Test3 record) {
        int i = Test3Mapper.updateByPrimaryKeySelective(record);
        return i;
    }

    @Override
    public int updateByPrimaryKey(Test3 record) {
        int i = Test3Mapper.updateByPrimaryKey(record);
        return i;
    }
}
