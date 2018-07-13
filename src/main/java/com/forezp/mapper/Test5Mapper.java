package com.forezp.mapper;

import com.forezp.po.Test5;
import com.forezp.po.Test5Example;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface Test5Mapper {
    int countByExample(Test5Example example);

    int deleteByExample(Test5Example example);

    int deleteByPrimaryKey(Integer id);

    int insert(Test5 record);

    int insertSelective(Test5 record);

    List<Test5> selectByExample(Test5Example example);

    Test5 selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Test5 record, @Param("example") Test5Example example);

    int updateByExample(@Param("record") Test5 record, @Param("example") Test5Example example);

    int updateByPrimaryKeySelective(Test5 record);

    int updateByPrimaryKey(Test5 record);
}