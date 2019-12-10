package singleton;

/**
 * ����ģʽ
 * �̰߳�ȫ���Ƚϳ��ã������ײ�����������Ϊһ��ʼ�ͳ�ʼ��
 * @author BillGL
 *
 */
public class SingletonSecond {
	private static SingletonSecond uniqueSingleton=new SingletonSecond();
	private SingletonSecond(){
		
	}
	public static SingletonSecond getInstance(){
		return uniqueSingleton;
	}
}
