package abstractFactoryPattern.productForTable;

import abstractFactoryPattern.entity.User;

public interface IUserTbl {
	int insertUser(User user);
	User getUser(int id);
}
