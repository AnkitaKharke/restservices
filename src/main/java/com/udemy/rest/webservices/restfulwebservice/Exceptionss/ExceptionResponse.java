package com.udemy.rest.webservices.restfulwebservice.Exceptionss;

import java.util.Date;

public class ExceptionResponse {
	
	private Date timestamp;
	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public void setDetails(String details) {
		this.details = details;
	}
	public ExceptionResponse(Date timestamp, String msg, String details) {
		super();
		this.timestamp = timestamp;
		this.msg = msg;
		this.details = details;
	}
	private String msg;
	private String details;

}
