package commandPattern.receiver;

public class ReceiverCook {
	private String name;
	
	
	
	public ReceiverCook(String name) {
		super();
		this.name = name;
		System.out.println("���ǳ�ʦ"+name);
	}

	/**
	 * ��������
	 */
	public void bakeMutton() {

		System.out.println("�յ����"+name+"������������....");
	}

	/**
	 * ����������
	 */

	public void bakeWing() {

		System.out.println("�յ����"+name+"������������....");
	}

}
