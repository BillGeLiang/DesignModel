package mediatorPattern;

import mediatorPattern.colleague.ColleagueIran;
import mediatorPattern.colleague.ColleagueUS;
import mediatorPattern.mediator.MediatorUN;

public class Client {
	public static void main(String[] args){
		MediatorUN un=new MediatorUN();
		/**
		 * ί���н���
		 */
		ColleagueUS us=new ColleagueUS(un);
		ColleagueIran iran=new ColleagueIran(un);
		
		/**
		 * �н�����Ҫ��ʶ����ί���Լ��Ķ���
		 */
		un.setIran(iran);
		un.setUs(us);
		
		/**
		 * ��ʼ����
		 */
		us.sendMessg("�Ҳ��������ʷ�չ������");
		
		System.out.println("���ۼ��ҽ��С���������");
		
		iran.sendMessg("��ƫ����");
		System.out.println("��һ�����۽���.......");
	}
}
