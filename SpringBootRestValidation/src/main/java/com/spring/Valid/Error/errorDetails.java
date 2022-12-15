package com.spring.Valid.Error;

import java.util.Date;

public class errorDetails {

	private Date time;
	private String message;
	private String errorDetails;
	
	public errorDetails(Date time, String message, String errorDetails) {
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
