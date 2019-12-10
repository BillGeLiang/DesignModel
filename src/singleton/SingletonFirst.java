package singleton;

/**
 * ����ģʽ����ʵ��(����ģʽ����
 * 
 * ���о�̬����GetInstance�ṩ����SingletonFirst��ȫ�ַ��ʵ㣬
 * ���ڳ���GetInstance�����⣬��ĳ�Ա��Ϊ˽�еģ�����GetInstance�ṩ��ΪΨһ���ʷ�ʽ��
 * ��GetInstance()�����У���uniqueInstance�Ƿ�Ϊnull�����жϣ����ʹ�ö���ֻ�ܱ�ʵ����һ��
 * @author BillGL
 *
 */
public class SingletonFirst {
	private static SingletonFirst uniqueInstance;
	
	private SingletonFirst(){}
	public static SingletonFirst getInstance(){
		if(uniqueInstance==null)
			uniqueInstance=new SingletonFirst();
		return uniqueInstance;
	}
	
}
