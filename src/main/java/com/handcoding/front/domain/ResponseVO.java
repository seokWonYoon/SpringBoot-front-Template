package com.handcoding.front.domain;

/**
 * 응답 도메인
 * @author 이승환
 * @version 2018.01.13 v1.0
 */
public class ResponseVO<T> {
	
	private int code = 200;
	private String message;
	private boolean check = true;
	private T response;
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public boolean isCheck() {
		return check;
	}
	public void setCheck(boolean check) {
		this.check = check;
	}
	public T getResponse() {
		return response;
	}
	public void setResponse(T response) {
		this.response = response;
	}
	@Override
	public String toString() {
		return "ResponseVO [code=" + code + ", message=" + message + ", check=" + check + ", response=" + response
				+ "]";
	}
}
