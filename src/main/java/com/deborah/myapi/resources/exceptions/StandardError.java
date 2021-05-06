package com.deborah.myapi.resources.exceptions;

public class StandardError {

	private Integer status;
	private Long timestamp;
	private String messge;

	public StandardError() {
		super();

	}

	public StandardError(Integer status, Long timestamp, String messge) {
		super();
		this.status = status;
		this.timestamp = timestamp;
		this.messge = messge;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Long getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public String getMessge() {
		return messge;
	}

	public void setMessge(String messge) {
		this.messge = messge;
	}

}
