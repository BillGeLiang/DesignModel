package abstractFactory.factory;

import abstractFactory.productForTable.ILoginTbl;
import abstractFactory.productForTable.IUserTbl;
import abstractFactory.productForTable.SQLServerLoginTbl;
import abstractFactory.productForTable.SQLServerUserTbl;

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
