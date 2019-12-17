package abstractFactoryPattern.factory;

import abstractFactoryPattern.productForTable.ILoginTbl;
import abstractFactoryPattern.productForTable.IUserTbl;

public interface ItblFactory {
	ILoginTbl createLoginTbl();
	IUserTbl createUserTbl();
}
