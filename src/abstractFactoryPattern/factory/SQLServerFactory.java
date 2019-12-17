package abstractFactoryPattern.factory;

import abstractFactoryPattern.productForTable.ILoginTbl;
import abstractFactoryPattern.productForTable.IUserTbl;
import abstractFactoryPattern.productForTable.SQLServerLoginTbl;
import abstractFactoryPattern.productForTable.SQLServerUserTbl;

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
