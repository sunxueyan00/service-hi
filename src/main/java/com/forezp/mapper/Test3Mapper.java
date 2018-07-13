package com.forezp.mapper;

import com.forezp.po.Test3;
import com.forezp.po.Test3Example;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface Test3Mapper {
    int countByExample(Test3Example example);

    int deleteByExample(Test3Example example);

    int deleteByPrimaryKey(Integer id);

    int insert(Test3 record);

    int insertSelective(Test3 record);

    List<Test3> selectByExample(Test3Example example);

    Test3 selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Test3 record, @Param("example") Test3Example example);

    int updateByExample(@Param("record") Test3 record, @Param("example") Test3Example example);

    int updateByPrimaryKeySelective(Test3 record);

    int updateByPrimaryKey(Test3 record);
}