package com.forezp.service.Impl;

import com.forezp.mapper.Test4Mapper;
import com.forezp.po.Test4;
import com.forezp.service.Test4Service;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by sunxueyan on 2018/7/14.
 */
@Slf4j
@Service
public class Test4ServiceImpl implements Test4Service {
    @Autowired
    private Test4Mapper Test4Mapper;
    @Override
    public int insertTest4(Test4 Test4) {
        int insert = Test4Mapper.insert(Test4);
        return insert;
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        int i = Test4Mapper.deleteByPrimaryKey(id);
        return i;
    }

    @Override
    public Test4 selectByPrimaryKey(Integer id) {
        Test4 Test4 = Test4Mapper.selectByPrimaryKey(id);
        return Test4;
    }

    @Override
    public int updateByPrimaryKeySelective(Test4 record) {
        int i = Test4Mapper.updateByPrimaryKeySelective(record);
        return i;
    }

    @Override
    public int updateByPrimaryKey(Test4 record) {
        int i = Test4Mapper.updateByPrimaryKey(record);
        return i;
    }
}
