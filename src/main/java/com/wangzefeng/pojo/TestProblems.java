package com.wangzefeng.pojo;

import java.util.Date;
import java.util.List;

public class TestProblems {

    private String testProblemsId;

    private String testContent;

    private String testTypeId;

    private String testAnswer;

    private Integer testNumber;

    private String propositionalUserId;

    private Date propositionalDate;

    private Integer degreeOfDifficulty;

    private SysUser sysUser;

    private TestType testType;

    private List<TestProblemOption> testProblemOptions;

    public String getTestProblemsId() {
        return testProblemsId;
    }


    public void setTestProblemsId(String testProblemsId) {
        this.testProblemsId = testProblemsId == null ? null : testProblemsId.trim();
    }

    public String getTestContent() {
        return testContent;
    }

    public void setTestContent(String testContent) {
        this.testContent = testContent == null ? null : testContent.trim();
    }

    public String getTestTypeId() {
        return testTypeId;
    }

    public void setTestTypeId(String testTypeId) {
        this.testTypeId = testTypeId == null ? null : testTypeId.trim();
    }

    public String getTestAnswer() {
        return testAnswer;
    }

    public void setTestAnswer(String testAnswer) {
        this.testAnswer = testAnswer == null ? null : testAnswer.trim();
    }

    public Integer getTestNumber() {
        return testNumber;
    }

    public void setTestNumber(Integer testNumber) {
        this.testNumber = testNumber;
    }

    public String getPropositionalUserId() {
        return propositionalUserId;
    }

    public void setPropositionalUserId(String propositionalUserId) {
        this.propositionalUserId = propositionalUserId == null ? null : propositionalUserId.trim();
    }

    public Date getPropositionalDate() {
        return propositionalDate;
    }

    public void setPropositionalDate(Date propositionalDate) {
        this.propositionalDate = propositionalDate;
    }

    public Integer getDegreeOfDifficulty() {
        return degreeOfDifficulty;
    }

    public void setDegreeOfDifficulty(Integer degreeOfDifficulty) {
        this.degreeOfDifficulty = degreeOfDifficulty;
    }

    public SysUser getSysUser() {
        return sysUser;
    }

    public void setSysUser(SysUser sysUser) {
        this.sysUser = sysUser;
    }

    public TestType getTestType() {
        return testType;
    }

    public void setTestType(TestType testType) {
        this.testType = testType;
    }

    public List<TestProblemOption> getTestProblemOptions() {
        return testProblemOptions;
    }

    public void setTestProblemOptions(List<TestProblemOption> testProblemOptions) {
        this.testProblemOptions = testProblemOptions;
    }
}