package com.billGL.AbstractFactory;

public class SQLServerLoginTbl implements ILoginTbl{
	@Override
	public int insertLogin(Login login) {
		System.out.println("����¼��Ϣ���뵽SQLServer��¼����\n�������ݣ�" + login);
		return 1;
	}

	@Override
	public Login getLogin(int id) {
		// TODO Auto-generated method stub
		System.out.println("����id��ѯSQLServer��¼����Login��Ϣ��" + id);
		return null;
	}
}
