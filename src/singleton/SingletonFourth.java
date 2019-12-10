package singleton;
/**
 * ��̬�ڲ��൥��ģʽ
 * ֻ�е�һ�ε���getInstance����ʱ��������ż��� Inner ����ʼ��instance ��
 * ֻ��һ���߳̿��Ի�ö���ĳ�ʼ�����������߳��޷����г�ʼ������֤�����Ψһ�ԡ�Ŀǰ�˷�ʽ�����е���ģʽ�����Ƽ���ģʽ
 * @author BillGL
 *
 */
public class SingletonFourth {
	 private SingletonFourth(){
	    }
	      public static SingletonFourth getInstance(){  
	        return Inner.instance;  
	    }  
	    private static class Inner {  
	        private static final SingletonFourth instance = new SingletonFourth();  
	    }  
}
