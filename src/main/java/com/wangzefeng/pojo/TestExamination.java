package com.wangzefeng.pojo;

import java.util.Date;

public class TestExamination {

    private String testExaminationId;

    private Date startTime;

    private Date endTime;

    private String testTypeId;

    private Integer testNumber;

    private Integer testGrade;

    private String sysUserId;

    private TestType testType;

    private SysUser sysUser;

    public String getTestExaminationId() {
        return testExaminationId;
    }

    public void setTestExaminationId(String testExaminationId) {
        this.testExaminationId = testExaminationId == null ? null : testExaminationId.trim();
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }


    public String getTestTypeId() {
        return testTypeId;
    }

    public void setTestTypeId(String testTypeId) {
        this.testTypeId = testTypeId == null ? null : testTypeId.trim();
    }

    public Integer getTestNumber() {
        return testNumber;
    }

    public void setTestNumber(Integer testNumber) {
        this.testNumber = testNumber;
    }

    public Integer getTestGrade() {
        return testGrade;
    }

    public void setTestGrade(Integer testGrade) {
        this.testGrade = testGrade;
    }

    public String getSysUserId() {
        return sysUserId;
    }

    public void setSysUserId(String sysUserId) {
        this.sysUserId = sysUserId == null ? null : sysUserId.trim();
    }

    public TestType getTestType() {
        return testType;
    }

    public void setTestType(TestType testType) {
        this.testType = testType;
    }

    public SysUser getSysUser() {
        return sysUser;
    }

    public void setSysUser(SysUser sysUser) {
        this.sysUser = sysUser;
    }
}