package abstractFactoryPattern.factory;

import abstractFactoryPattern.productForTable.ILoginTbl;
import abstractFactoryPattern.productForTable.IUserTbl;
import abstractFactoryPattern.productForTable.MySQLLoginTbl;
import abstractFactoryPattern.productForTable.MySQLUserTbl;

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
