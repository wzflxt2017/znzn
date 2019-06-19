package com.wangzefeng.dao;

import com.wangzefeng.pojo.TestExamination;
import com.wangzefeng.example.TestExaminationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TestExaminationMapper {

    int countByExample(TestExaminationExample example);

    int deleteByExample(TestExaminationExample example);

    int deleteByPrimaryKey(String testExaminationId);

    int insert(TestExamination record);

    int insertSelective(TestExamination record);

    List<TestExamination> selectByExample(TestExaminationExample example);

    TestExamination selectByPrimaryKey(String testExaminationId);

    int updateByExampleSelective(@Param("record") TestExamination record, @Param("example") TestExaminationExample example);

    int updateByExample(@Param("record") TestExamination record, @Param("example") TestExaminationExample example);

    int updateByPrimaryKeySelective(TestExamination record);

    int updateByPrimaryKey(TestExamination record);
    List<TestExamination> selectByUser(String sysUserId);
}