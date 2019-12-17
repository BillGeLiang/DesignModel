package abstractFactoryPattern.productForTable;

import abstractFactoryPattern.entity.Login;

public interface ILoginTbl {
	int insertLogin(Login login);
	Login getLogin(int id);
}
