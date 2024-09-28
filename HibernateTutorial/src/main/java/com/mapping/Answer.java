package com.mapping;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;

@Entity
public class Answer {
	
	@Id
	@Column(name="answer_id")
	private int answerId;
	private String answer;
	
	@ManyToOne
	
	private Question question;
	
	/*
	 * @OneToOne(mappedBy = "answer") private Question question;
	 */
	
	public Answer() {
		
	}

	public Answer(int answerId, String answer) {
		
		this.answerId = answerId;
		this.answer = answer;
	}

	public int getAnswerId() {
		return answerId;
	}

	public void setAnswerId(int answerId) {
		this.answerId = answerId;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	
	public Question getQuestion() {
		return question;
	}

	public void setQuestion(Question question) {
		this.question = question;
	}

	@Override
	public String toString() {
		return "Answer [answerId=" + answerId + ", answer=" + answer + ", question=" + question + "]";
	}

	
	

}
