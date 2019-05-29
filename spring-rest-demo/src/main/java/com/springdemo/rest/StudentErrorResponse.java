package com.springdemo.rest;

public class StudentErrorResponse {
	
	private String status,message,timestamp;

	public StudentErrorResponse() {
		
	}
	
	public StudentErrorResponse(String status, String message, String timestamp) {
		this.status = status;
		this.message = message;
		this.timestamp = timestamp;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}
	
	

}
