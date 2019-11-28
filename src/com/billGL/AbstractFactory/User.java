package com.billGL.AbstractFactory;

public class User {
	int id;
	String userName;
	int num;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", userName=" + userName + ", num=" + num
				+ "]";
	}
	
	
}
