package abstractFactory.productForTable;

import abstractFactory.entity.User;

public interface IUserTbl {
	int insertUser(User user);
	User getUser(int id);
}
