package com.billGL.AbstractFactory;

public class MySQLFactory implements ItblFactory {

	@Override
	public ILoginTbl createLoginTbl() {
		// TODO Auto-generated method stub
		return new MySQLLoginTbl();
	}

	@Override
	public IUserTbl createUserTbl() {
		// TODO Auto-generated method stub
		return new MySQLUserTbl();
	}

}
