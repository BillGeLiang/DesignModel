package singleton;

/**
 * 饿汉模式
 * 线程安全，比较常用，但容易产生垃圾，因为一开始就初始化
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
