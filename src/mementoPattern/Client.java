package mementoPattern;

import mementoPattern.careTaker.RoleCareTaker;
import mementoPattern.role.Role;

public class Client {
	public static void main(String[] args){
		
		
		/**
		 * �����
		 * Role [hp=100, mp=200, defence=244, state=��������]
			�浵�ɹ�....
			==============>
			��BOSS����ƴɱ
			Role [hp=0, mp=0, defence=34, state=��������]
			================>��ȡ�浵
			Role [hp=100, mp=200, defence=244, state=��������]
			��սһ�Ρ���������

		 */
		
		//�����ļ�������
		RoleCareTaker taker=new RoleCareTaker();
		
		/**
		 * ����һ����ɫ����������ʼ״̬
		 */
		Role euonyMusRole=new Role(100, 200, 244, "��������");
		euonyMusRole.checkState();
		//���ڱ����ļ��������д����,��߳ɹ���
		taker.setMemento(euonyMusRole.createMemento());
		System.out.println("�浵�ɹ�....");
		System.out.println("==============>");
		//��BOSSս��
		euonyMusRole.fightWithBoss();
		euonyMusRole.checkState();
		System.out.println("================>��ȡ�浵");
		//�����򲻹����Ӵ浵�������лָ��浵
		euonyMusRole.restoreMemento(taker.getMemento());
		//���״̬
		euonyMusRole.checkState();
		System.out.println("��սһ�Ρ���������");
	}
}
