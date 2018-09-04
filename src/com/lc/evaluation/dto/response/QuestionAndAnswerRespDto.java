package com.lc.evaluation.dto.response;

import java.util.Map;

import com.lc.evaluation.dto.basic.BasicResponseMapDto;

public class QuestionAndAnswerRespDto implements BasicResponseMapDto{
	
	String teacherName;
	
	String courseName;
	
	Integer answerId;
	
	Integer assessId;

	String questionContext;
	
	String answer;
	
	public Integer getAssessId() {
		return assessId;
	}

	public void setAssessId(Integer assessId) {
		this.assessId = assessId;
	}
	
	public QuestionAndAnswerRespDto() {
		// TODO Auto-generated constructor stub
	}
	
	public QuestionAndAnswerRespDto(String teacherName, String courseName, Integer answerId, String questionContext,
			String answer, Integer assessId) {
		super();
		this.teacherName = teacherName;
		this.courseName = courseName;
		this.answerId = answerId;
		this.questionContext = questionContext;
		this.answer = answer;
		this.assessId = assessId;
	}



	@Override
	public QuestionAndAnswerRespDto init(Map mapData) {
		
		this.answerId = (Integer) mapData.get("id");
		this.questionContext = (String) mapData.get("context");
		this.answer = (String) mapData.get("answer");
		
		return this;
	}

	public Integer getAnswerId() {
		return answerId;
	}

	public void setAnswerId(Integer answerId) {
		this.answerId = answerId;
	}

	public String getQuestionContext() {
		return questionContext;
	}

	public void setQuestionContext(String questionContext) {
		this.questionContext = questionContext;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	@Override
	public String toString() {
		return "QuestionAndAnswerRespDto [answerId=" + answerId + ", questionContext=" + questionContext + ", answer="
				+ answer + "]";
	}

	public String getTeacherName() {
		return teacherName;
	}

	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	
	

}
