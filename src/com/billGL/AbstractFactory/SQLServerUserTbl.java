package com.billGL.AbstractFactory;

public class SQLServerUserTbl implements IUserTbl{

	@Override
	public int insertUser(User user) {
		System.out.println("���û���Ϣ���뵽SQLServer��¼����\n�������ݣ�" + user);
		return 1;
	}

	@Override
	public User getUser(int id) {
		// TODO Auto-generated method stub
		System.out.println("����id��ѯSQLServer��¼����User��Ϣ��" + id);
		return null;
	}

}
