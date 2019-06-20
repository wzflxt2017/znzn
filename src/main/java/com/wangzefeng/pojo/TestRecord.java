package com.wangzefeng.pojo;

import java.util.Date;

public class TestRecord {

    private String testRecordId;

    private Date testTime;

    private String testExaminationId;

    private String testProblemsId;

    private Integer testNum;

    private String userAnswer;

    private String rightAnswer;

    private String isRight;

    private TestExamination testExamination;

    private TestProblems testProblems;

    public String getTestRecordId() {
        return testRecordId;
    }

    public void setTestRecordId(String testRecordId) {
        this.testRecordId = testRecordId == null ? null : testRecordId.trim();
    }

    public Date getTestTime() {
        return testTime;
    }

    public void setTestTime(Date testTime) {
        this.testTime = testTime;
    }

    public String getTestExaminationId() {
        return testExaminationId;
    }

    public void setTestExaminationId(String testExaminationId) {
        this.testExaminationId = testExaminationId == null ? null : testExaminationId.trim();
    }

    public String getTestProblemsId() {
        return testProblemsId;
    }

    public void setTestProblemsId(String testProblemsId) {
        this.testProblemsId = testProblemsId == null ? null : testProblemsId.trim();
    }

    public Integer getTestNum() {
        return testNum;
    }

    public void setTestNum(Integer testNum) {
        this.testNum = testNum;
    }

    public String getUserAnswer() {
        return userAnswer;
    }

    public void setUserAnswer(String userAnswer) {
        this.userAnswer = userAnswer == null ? null : userAnswer.trim();
    }

    public String getRightAnswer() {
        return rightAnswer;
    }

    public void setRightAnswer(String rightAnswer) {
        this.rightAnswer = rightAnswer == null ? null : rightAnswer.trim();
    }

    public String getIsRight() {
        return isRight;
    }

    public void setIsRight(String isRight) {
        this.isRight = isRight == null ? null : isRight.trim();
    }

    public TestExamination getTestExamination() {
        return testExamination;
    }

    public void setTestExamination(TestExamination testExamination) {
        this.testExamination = testExamination;
    }

    public TestProblems getTestProblems() {
        return testProblems;
    }

    public void setTestProblems(TestProblems testProblems) {
        this.testProblems = testProblems;
    }
}