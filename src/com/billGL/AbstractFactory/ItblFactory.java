package com.billGL.AbstractFactory;

public interface ItblFactory {
	ILoginTbl createLoginTbl();
	IUserTbl createUserTbl();
}
