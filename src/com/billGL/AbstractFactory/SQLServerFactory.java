package com.billGL.AbstractFactory;

public class SQLServerFactory implements ItblFactory {

	@Override
	public ILoginTbl createLoginTbl() {
		// TODO Auto-generated method stub
		return new SQLServerLoginTbl();
	}

	@Override
	public IUserTbl createUserTbl() {
		// TODO Auto-generated method stub
		return new SQLServerUserTbl();
	}

}
