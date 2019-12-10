package singleton;
/**
 * 静态内部类单例模式
 * 只有第一次调用getInstance方法时，虚拟机才加载 Inner 并初始化instance ，
 * 只有一个线程可以获得对象的初始化锁，其他线程无法进行初始化，保证对象的唯一性。目前此方式是所有单例模式中最推荐的模式
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
