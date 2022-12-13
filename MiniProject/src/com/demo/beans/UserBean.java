package com.demo.beans;

import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class UserBean {
	private int user_idx;
	@Size(min=2, max=4,  message="이름은 2자에서 4자까지")
	@Pattern(regexp = "[가-힣]*", message="한글만 사용 가능")
	private String user_name;
	@Size(min=4, max=10,  message="아디는 4자에서 10자까지")
	@Pattern(regexp = "[a-zA-Z0-9]*",  message="영문 대소문자와 숫자만 사용 가능")
	private String user_id;
	@Size(min=4, max=20, message="패스워드는 4자에서 20자까지")
	@Pattern(regexp = "[a-zA-Z0-9]*",message="영문 대소문자와 숫자만 사용 가능")
	private String user_pw;
	@Size(min=4, max=20, message="패스워드는 4자에서 20자까지")
	@Pattern(regexp = "[a-zA-Z0-9]*",message="영문 대소문자와 숫자만 사용 가능" )
	private String user_pw2; //비밀번호 확인
	
	@AssertTrue(message = "아이디 중복체크 해주세요")
	private boolean userIdChecked;	
	public UserBean() {
		this.userIdChecked = false;
	}
		
	public boolean isUserIdChecked() {
		return userIdChecked;
	}

	public void setUserIdChecked(boolean userIdChecked) {
		this.userIdChecked = userIdChecked;
	}

	public int getUser_idx() {
		return user_idx;
	}
	public void setUser_idx(int user_idx) {
		this.user_idx = user_idx;
	}
	
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	
	public String getUser_pw() {
		return user_pw;
	}
	public void setUser_pw(String user_pw) {
		this.user_pw = user_pw;
	}

	@Size(min=4, max=20)
	@Pattern(regexp = "[a-zA-Z0-9]*")
	public String getUser_pw2() {
		return user_pw2;
	}
	public void setUser_pw2(String user_pw2) {
		this.user_pw2 = user_pw2;
	}

}
