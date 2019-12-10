package abstractFactory.factory;

import abstractFactory.productForTable.ILoginTbl;
import abstractFactory.productForTable.IUserTbl;

public interface ItblFactory {
	ILoginTbl createLoginTbl();
	IUserTbl createUserTbl();
}
