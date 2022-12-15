package com.spring.Ass2.error;

import java.util.Date;

public class ErrorDetails {
	private Date time;
	private String message;
	private String errorDetails;
	
	public ErrorDetails(Date time, String message, String errorDetails) {
		super();
		this.time = time;
		this.message = message;
		this.errorDetails = errorDetails;
	}
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getErrorDetails() {
		return errorDetails;
	}
	public void setErrorDetails(String errorDetails) {
		this.errorDetails = errorDetails;
	}
}
