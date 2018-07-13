package com.forezp.mapper;

import com.forezp.po.Test2;
import com.forezp.po.Test2Example;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface Test2Mapper {
    int countByExample(Test2Example example);

    int deleteByExample(Test2Example example);

    int deleteByPrimaryKey(Integer id);

    int insert(Test2 record);

    int insertSelective(Test2 record);

    List<Test2> selectByExample(Test2Example example);

    Test2 selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Test2 record, @Param("example") Test2Example example);

    int updateByExample(@Param("record") Test2 record, @Param("example") Test2Example example);

    int updateByPrimaryKeySelective(Test2 record);

    int updateByPrimaryKey(Test2 record);
}