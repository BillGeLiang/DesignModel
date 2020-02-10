package ProxyPattern;

import ProxyPattern.dynamicProxy.NonOwnerInvocationHandler;
import ProxyPattern.dynamicProxy.OwnerInvocationHandler;
import ProxyPattern.dynamicProxy.PersonBean;
import ProxyPattern.dynamicProxy.PersonTarget;
import ProxyPattern.staticProxy.Printable;
import ProxyPattern.staticProxy.Proxy;

public class Client {
	public static void main(String[] args) {

		staticProxyTest();
		dynamicProxtTest();
	}

	/**
	 * 动态代理测试
	 * 结果：
	 * 	用户自身测试=============>
		gender:male
		hotRate:0.85
		**********************can not setHotRate by yourSelf************
		now_gender:now_male
		now_hotRate:0.85
		其他用户测试==============>
		gender:running
		hotRate:0.85
		**********************can not set others' baseInfo**********
		now_gender:now_male
		now_hotRate:0.55
	 * 
	 */
	private static void dynamicProxtTest() {
		/**
		 * 用户自身和其他用户对象的实例
		 */
		PersonBean person = new PersonTarget("EuonyMus", "male", "running",
				0.85);

		/**
		 * 实例自身用户和其他用户处理器
		 */
		NonOwnerInvocationHandler nonOwnerHandler = new NonOwnerInvocationHandler(
				person);
		OwnerInvocationHandler ownerHandler = new OwnerInvocationHandler(person);

		/**
		 * 实例化代理
		 */
		PersonBean myUserProxy = (PersonBean) java.lang.reflect.Proxy
				.newProxyInstance(person.getClass().getClassLoader(), person
						.getClass().getInterfaces(), ownerHandler);
		PersonBean otherUserProxy = (PersonBean) java.lang.reflect.Proxy
				.newProxyInstance(person.getClass().getClassLoader(), person
						.getClass().getInterfaces(), nonOwnerHandler);

		/**
		 * 方法测试 
		 */

		System.out.println("用户自身测试=============>");
		System.out.println("gender:" + myUserProxy.getGender());
		System.out.println("hotRate:" + myUserProxy.getHotRate());
		myUserProxy.setGender("now_male");
		try {
			myUserProxy.setHotRate(0.22);// 抛出异常
		} catch (Exception e) {
			System.out.println("**********************can not setHotRate by yourSelf************");
		}
		System.out.println("now_gender:" + myUserProxy.getGender()
				+ "\nnow_hotRate:" + myUserProxy.getHotRate());

		System.out.println("其他用户测试==============>");
		System.out.println("gender:" + otherUserProxy.getInterests());
		System.out.println("hotRate:" + otherUserProxy.getHotRate());
		try {
			otherUserProxy.setGender("now_female");// 抛出异常
		} catch (Exception e) {
			System.out.println("**********************can not set others' baseInfo**********");
		}
		otherUserProxy.setHotRate(0.55);
		System.out.println("now_gender:" + otherUserProxy.getGender()
				+ "\nnow_hotRate:" + otherUserProxy.getHotRate());

	}

	/**
	 * 静态代理测试
	 */
	public static void staticProxyTest() {
		Printable printableProxy = new Proxy();
		printableProxy.setPrinterName("EuonyMus、BillGL!!");
		System.out.println("代理的名字为：" + printableProxy.getPrinterName());
		System.out.println("代理当前处理不了的问题，交由真正的打印机执行....");

		/**
		 * 创建打印机实例(模拟5s的启动时间) 正在生成打印机实例 当前打印机名称：EuonyMus、BillGL!! （5s后执行.....）
		 * 生成打印机实例成功 开始打印-----------------> Hello!!EuonyMus
		 * 打印成功----------------->
		 */
		printableProxy.print("Hello!!EuonyMus");
		System.out
				.println("==========================分界线==================================");
		/**
		 * 再次执行相同工作 结果： 当前代理名称;now_EuonyMus 存在打印机实例 开始打印----------------->
		 * now_hello!!!EuonyMus 打印成功----------------->
		 */
		printableProxy.setPrinterName("now_EuonyMus、BillGL!!");
		System.out.println("当前代理名称;" + printableProxy.getPrinterName());
		printableProxy.print("now_hello!!!EuonyMus");
	}
}
