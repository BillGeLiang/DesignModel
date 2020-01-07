package observerPattern.observer;

import observerPattern.subject.FrontDesk;

/**
 * �칫��Ա��A
 * @author BillGL
 *
 */
public class OfficerA extends AbsObserver {
	private String name="�칫��Ա��A";
	private FrontDesk frontDesk;
	
	
	
	
	public OfficerA(FrontDesk frontDesk) {
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
