package abstractFactory.productForTable;

import abstractFactory.entity.Login;

public interface ILoginTbl {
	int insertLogin(Login login);
	Login getLogin(int id);
}
