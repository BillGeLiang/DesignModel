package observerPattern;

import observerPattern.observer.AbsObserver;
import observerPattern.observer.OfficerA;
import observerPattern.observer.OfficerB;
import observerPattern.subject.AbsSubject;
import observerPattern.subject.FrontDesk;

public class Client {
	public static void main(String[] args){
		
		/**
		 * �����
		 * nameΪ���칫��Ա��A����ǰ̨��״̬Ϊ���ϰ�����
			��ʼ����
			nameΪ���칫��Ա��B����ǰ̨��״̬Ϊ���ϰ�����
			��ʼ����
			======================>
			nameΪ���칫��Ա��A����ǰ̨��״̬Ϊ���ϰ�û��
			���ֻ
			nameΪ���칫��Ա��B����ǰ̨��״̬Ϊ���ϰ�û��
			���ֻ
		 */
		FrontDesk frontDesk=new FrontDesk();
		/**
		 * �۲�����������
		 */
		AbsObserver officerA=new OfficerA(frontDesk);
		AbsObserver officerB=new OfficerB(frontDesk);
		/**
		 * ��ӹ۲���
		 */
		frontDesk.addObserver(officerA);
		frontDesk.addObserver(officerB);
		
		/**
		 * ��������״̬��֪ͨ�۲���
		 */
		frontDesk.setState("�ϰ�����");
		frontDesk.notifyOb();
		System.out.println("======================>");
		frontDesk.setState("�ϰ�û��");
		frontDesk.notifyOb();
		
	}
}
