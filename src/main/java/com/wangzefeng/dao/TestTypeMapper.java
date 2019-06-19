package com.wangzefeng.dao;

import com.wangzefeng.pojo.TestType;
import com.wangzefeng.example.TestTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TestTypeMapper {

    int deleteByPrimaryKey(String testTypeId);

    int insert(TestType record);

    int insertSelective(TestType record);

    TestType selectByPrimaryKey(String testTypeId);

    int updateByPrimaryKeySelective(TestType record);

    int updateByPrimaryKey(TestType record);

    List<TestType> selectAll();
    TestType selectByTypeClass(String typeClass);
}