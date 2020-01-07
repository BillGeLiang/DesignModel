package observerPattern.observer;

import observerPattern.subject.FrontDesk;

/**
 * �칫��Ա��B
 * @author BillGL
 *
 */
public class OfficerB extends AbsObserver {
	private String name="�칫��Ա��B";
	private FrontDesk frontDesk;
	
	
	
	
	public OfficerB(FrontDesk frontDesk) {
		super();
		this.frontDesk = frontDesk;
	}




	@Override
	public void update() {
		String state=frontDesk.getState();
		System.out.println("nameΪ��"+name+"����ǰ̨��״̬Ϊ��"+state);
		if(state.equals("�ϰ�����"))
			System.out.println("��ʼ����");
		if(state.equals("�ϰ�û��"))
			System.out.println("���ֻ");
	}
}
