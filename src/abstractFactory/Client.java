package abstractFactory;

import abstractFactory.entity.Login;
import abstractFactory.entity.User;
import abstractFactory.factory.ItblFactory;
import abstractFactory.factory.MySQLFactory;
import abstractFactory.factory.SQLServerFactory;
import abstractFactory.productForTable.ILoginTbl;
import abstractFactory.productForTable.IUserTbl;

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
