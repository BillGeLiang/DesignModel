package adaptorPattern;

import adaptorPattern.adaptorForClass.ClassAdaptor;
import adaptorPattern.adaptorForClass.ClassTarget;
import adaptorPattern.adaptorForObject.ObjectAdaptee;
import adaptorPattern.adaptorForObject.ObjectAdaptor;
import adaptorPattern.adaptorForObject.ObjectTarget;

public class Client {
	private static ClassTarget adaptor;
	private static ObjectTarget objectAdaptor;
	public static void main(String[] args){
		
		adaptor=new ClassAdaptor();
		/**
		 * �����
		 * 	target��������ʵ��........
		 * 	�����ߵľ���ʵ��...........
		 */
		doWorkForClass(adaptor);
		
		
		/**
		 * �����
		 * 	target��������ʵ��........
		 * 	�����ߵľ���ʵ��...........
		 */
		objectAdaptor=new ObjectAdaptor(new ObjectAdaptee());
		doWorkForObject(objectAdaptor);
	}
	
	public static void doWorkForClass(ClassTarget adaptor){
		adaptor.request();
	}
	
	
	public static void doWorkForObject(ObjectTarget adaptor){
		adaptor.request();
	}
}
