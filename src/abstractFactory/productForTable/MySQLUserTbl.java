package abstractFactory.productForTable;

import abstractFactory.entity.User;

public class MySQLUserTbl implements IUserTbl{

	@Override
	public int insertUser(User user) {
		System.out.println("���û���Ϣ���뵽MySQL��¼����\n�������ݣ�" + user);
		return 1;
	}

	@Override
	public User getUser(int id) {
		// TODO Auto-generated method stub
		System.out.println("����id��ѯMySQL��¼����User��Ϣ��" + id);
		return null;
	}

}
