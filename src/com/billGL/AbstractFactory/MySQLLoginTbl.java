package com.billGL.AbstractFactory;

public class MySQLLoginTbl implements ILoginTbl {

	@Override
	public int insertLogin(Login login) {
		System.out.println("����¼��Ϣ���뵽MySQL��¼����\n�������ݣ�" + login);
		return 1;
	}

	@Override
	public Login getLogin(int id) {
		// TODO Auto-generated method stub
		System.out.println("����id��ѯMySQL��¼����Login��Ϣ��" + id);
		return null;
	}

}
