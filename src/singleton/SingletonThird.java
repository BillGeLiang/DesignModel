package singleton;

/**
 * ˫����ģʽ
 * �̰߳�ȫ���ӳٳ�ʼ�������ַ�ʽ����˫�����ƣ���ȫ���ڶ��߳�������ܱ��ָ�����
 * ˫�ؼ��ģʽ�����������ε��жϣ���һ����Ϊ�˱��ⲻҪ��ʵ�����ڶ�����Ϊ�˽���ͬ����������߳����⡣
 * ����singleton=new Singleton()����Ĵ�����JVM�п��ܻ�����������ڶ��̷߳����´��ڷ��գ�
 * ʹ��volatile����signletonʵ��������Ч����������⡣
 * @author BillGL
 *
 */
public class SingletonThird {
	private volatile static SingletonThird uniqueSingleton;  
    private SingletonThird (){}  
    public static SingletonThird getSingleton() {  
    if (uniqueSingleton == null) {  
        synchronized (SingletonThird.class) { //�����������࣬�൱��static synchronized 
        if (uniqueSingleton == null) {  
        	uniqueSingleton = new SingletonThird();  
        }  
        }  
    }  
    return uniqueSingleton;  
    }  
}
