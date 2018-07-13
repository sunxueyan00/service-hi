package com.forezp.mapper;

import com.forezp.po.Test4;
import com.forezp.po.Test4Example;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface Test4Mapper {
    int countByExample(Test4Example example);

    int deleteByExample(Test4Example example);

    int deleteByPrimaryKey(Integer id);

    int insert(Test4 record);

    int insertSelective(Test4 record);

    List<Test4> selectByExample(Test4Example example);

    Test4 selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Test4 record, @Param("example") Test4Example example);

    int updateByExample(@Param("record") Test4 record, @Param("example") Test4Example example);

    int updateByPrimaryKeySelective(Test4 record);

    int updateByPrimaryKey(Test4 record);
}