package abstractFactory.factory;

import abstractFactory.productForTable.ILoginTbl;
import abstractFactory.productForTable.IUserTbl;
import abstractFactory.productForTable.MySQLLoginTbl;
import abstractFactory.productForTable.MySQLUserTbl;

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
