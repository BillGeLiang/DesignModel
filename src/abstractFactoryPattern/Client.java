package abstractFactoryPattern;

import abstractFactoryPattern.entity.Login;
import abstractFactoryPattern.entity.User;
import abstractFactoryPattern.factory.ItblFactory;
import abstractFactoryPattern.factory.MySQLFactory;
import abstractFactoryPattern.factory.SQLServerFactory;
import abstractFactoryPattern.productForTable.ILoginTbl;
import abstractFactoryPattern.productForTable.IUserTbl;

public class Client {
	public static void main(String[] args)throws Exception{
		
		User user=new User();
		Login login=new Login();
		
		ItblFactory mysqlFactory=new MySQLFactory();
		ItblFactory sqlserverFactory=new SQLServerFactory();
		IUserTbl mysqlUserTbl= mysqlFactory.createUserTbl();
		ILoginTbl mysqlLoginTbl= mysqlFactory.createLoginTbl();
		mysqlUserTbl.insertUser(user);
		mysqlUserTbl.getUser(1);
		mysqlLoginTbl.insertLogin(login);
		mysqlLoginTbl.getLogin(2);
		IUserTbl sqlserverUserTbl=(IUserTbl) sqlserverFactory.createUserTbl();
		ILoginTbl sqlserverLoginTbl=(ILoginTbl) mysqlFactory.createLoginTbl();
		sqlserverUserTbl.insertUser(user);
		sqlserverUserTbl.getUser(1);
		sqlserverLoginTbl.insertLogin(login);
		sqlserverLoginTbl.getLogin(2);
	}
}
