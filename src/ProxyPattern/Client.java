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
	 * ��̬�������
	 * �����
	 * 	�û��������=============>
		gender:male
		hotRate:0.85
		**********************can not setHotRate by yourSelf************
		now_gender:now_male
		now_hotRate:0.85
		�����û�����==============>
		gender:running
		hotRate:0.85
		**********************can not set others' baseInfo**********
		now_gender:now_male
		now_hotRate:0.55
	 * 
	 */
	private static void dynamicProxtTest() {
		/**
		 * �û�����������û������ʵ��
		 */
		PersonBean person = new PersonTarget("EuonyMus", "male", "running",
				0.85);

		/**
		 * ʵ�������û��������û�������
		 */
		NonOwnerInvocationHandler nonOwnerHandler = new NonOwnerInvocationHandler(
				person);
		OwnerInvocationHandler ownerHandler = new OwnerInvocationHandler(person);

		/**
		 * ʵ��������
		 */
		PersonBean myUserProxy = (PersonBean) java.lang.reflect.Proxy
				.newProxyInstance(person.getClass().getClassLoader(), person
						.getClass().getInterfaces(), ownerHandler);
		PersonBean otherUserProxy = (PersonBean) java.lang.reflect.Proxy
				.newProxyInstance(person.getClass().getClassLoader(), person
						.getClass().getInterfaces(), nonOwnerHandler);

		/**
		 * �������� 
		 */

		System.out.println("�û��������=============>");
		System.out.println("gender:" + myUserProxy.getGender());
		System.out.println("hotRate:" + myUserProxy.getHotRate());
		myUserProxy.setGender("now_male");
		try {
			myUserProxy.setHotRate(0.22);// �׳��쳣
		} catch (Exception e) {
			System.out.println("**********************can not setHotRate by yourSelf************");
		}
		System.out.println("now_gender:" + myUserProxy.getGender()
				+ "\nnow_hotRate:" + myUserProxy.getHotRate());

		System.out.println("�����û�����==============>");
		System.out.println("gender:" + otherUserProxy.getInterests());
		System.out.println("hotRate:" + otherUserProxy.getHotRate());
		try {
			otherUserProxy.setGender("now_female");// �׳��쳣
		} catch (Exception e) {
			System.out.println("**********************can not set others' baseInfo**********");
		}
		otherUserProxy.setHotRate(0.55);
		System.out.println("now_gender:" + otherUserProxy.getGender()
				+ "\nnow_hotRate:" + otherUserProxy.getHotRate());

	}

	/**
	 * ��̬�������
	 */
	public static void staticProxyTest() {
		Printable printableProxy = new Proxy();
		printableProxy.setPrinterName("EuonyMus��BillGL!!");
		System.out.println("���������Ϊ��" + printableProxy.getPrinterName());
		System.out.println("����ǰ�����˵����⣬���������Ĵ�ӡ��ִ��....");

		/**
		 * ������ӡ��ʵ��(ģ��5s������ʱ��) �������ɴ�ӡ��ʵ�� ��ǰ��ӡ�����ƣ�EuonyMus��BillGL!! ��5s��ִ��.....��
		 * ���ɴ�ӡ��ʵ���ɹ� ��ʼ��ӡ-----------------> Hello!!EuonyMus
		 * ��ӡ�ɹ�----------------->
		 */
		printableProxy.print("Hello!!EuonyMus");
		System.out
				.println("==========================�ֽ���==================================");
		/**
		 * �ٴ�ִ����ͬ���� ����� ��ǰ��������;now_EuonyMus ���ڴ�ӡ��ʵ�� ��ʼ��ӡ----------------->
		 * now_hello!!!EuonyMus ��ӡ�ɹ�----------------->
		 */
		printableProxy.setPrinterName("now_EuonyMus��BillGL!!");
		System.out.println("��ǰ��������;" + printableProxy.getPrinterName());
		printableProxy.print("now_hello!!!EuonyMus");
	}
}
