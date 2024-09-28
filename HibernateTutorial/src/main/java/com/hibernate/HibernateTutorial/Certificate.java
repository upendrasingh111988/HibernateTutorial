package com.hibernate.HibernateTutorial;

import jakarta.persistence.Embeddable;

@Embeddable
public class Certificate {
	private String cource;
	private String duration;
	
	public Certificate() {
		
	}

	public Certificate(String cource, String duration) {
		super();
		this.cource = cource;
		this.duration = duration;
	}

	public String getCource() {
		return cource;
	}

	public void setCource(String cource) {
		this.cource = cource;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	@Override
	public String toString() {
		return "Certificate [cource=" + cource + ", duration=" + duration + "]";
	}
	

}
