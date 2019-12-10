package singleton;

/**
 * 单例模式经典实现(懒汉模式）：
 * 
 * 公有静态方法GetInstance提供访问SingletonFirst的全局访问点，
 * 由于除了GetInstance方法外，类的成员均为私有的，所以GetInstance提供的为唯一访问方式。
 * 在GetInstance()方法中，对uniqueInstance是否为null做了判断，因此使得对象只能被实例化一次
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
