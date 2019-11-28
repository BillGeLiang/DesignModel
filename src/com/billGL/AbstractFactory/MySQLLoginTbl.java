package com.billGL.AbstractFactory;

public class MySQLLoginTbl implements ILoginTbl {

	@Override
	public int insertLogin(Login login) {
		System.out.println("将登录信息插入到MySQL登录表中\n插入内容：" + login);
		return 1;
	}

	@Override
	public Login getLogin(int id) {
		// TODO Auto-generated method stub
		System.out.println("根据id查询MySQL登录表中Login信息：" + id);
		return null;
	}

}
