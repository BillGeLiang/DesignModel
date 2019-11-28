package com.billGL.AbstractFactory;

public class SQLServerUserTbl implements IUserTbl{

	@Override
	public int insertUser(User user) {
		System.out.println("将用户信息插入到SQLServer登录表中\n插入内容：" + user);
		return 1;
	}

	@Override
	public User getUser(int id) {
		// TODO Auto-generated method stub
		System.out.println("根据id查询SQLServer登录表中User信息：" + id);
		return null;
	}

}
