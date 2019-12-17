package prototypePattern;

import prototypePattern.deepCopy.AnotherDeepObject;
import prototypePattern.deepCopy.DeepPrototype;
import prototypePattern.shadowCopy.AnotherShadowObject;
import prototypePattern.shadowCopy.ShadowPrototypeObject;

public class Client {
	
	public static void main(String[] args) throws CloneNotSupportedException{
		/**
		 * ǳ����
		 */
//		AnotherShadowObject anotherObject=new AnotherShadowObject("anotherObject",3,4.5f);
//		ShadowPrototypeObject prototype=new ShadowPrototypeObject("ǳ����", 2, 2.4f, anotherObject);
//		System.out.println(prototype);
//		
//		ShadowPrototypeObject copy=prototype.clone();
//		copy.setName("ǳ����copy");
//		copy.setIvalue(7);
//		copy.getAnotherShadowObject().setKey("anotherObjectCopy");
//		copy.getAnotherShadowObject().setInumber(7);
//		copy.getAnotherShadowObject().setFnumber(7.7f);
		/**
		 * �����
		 * ShadowObject [name=ǳ����, ivalue=2, fvalue=2.4, anotherShadowObject=AnotherShadowObject [key=anotherObject, inumber=3, fnumber=4.5]]
		 * ShadowObject [name=ǳ����copy, ivalue=7, fvalue=2.4, anotherShadowObject=AnotherShadowObject [key=anotherObjectCopy, inumber=7, fnumber=7.7]]
		 * ShadowObject [name=ǳ����, ivalue=2, fvalue=2.4, anotherShadowObject=AnotherShadowObject [key=anotherObjectCopy, inumber=7, fnumber=7.7]]
		*/
//		System.out.println(copy);
//		System.out.println(prototype);
		/**
		 * ���ۣ�ǳ��¡�����¡�������Ͷ�����˿�����������ԭ�Ͷ�����ͬһ���������Ͷ�����ڴ��ַ�������ı����ö���ԭ��Ҳ����֮�ı�
		 */
		
		
		
		/*******************************��ȿ���*******************************************************************************/
		AnotherDeepObject anotherDeep=new AnotherDeepObject("anotherDeep", 2, 2.2f);
		DeepPrototype deepPrototype=new DeepPrototype("��ȸ���",1,1.1f,anotherDeep);
		System.out.println(deepPrototype);
		DeepPrototype deepCopy=deepPrototype.clone();
		deepCopy.setFvalue(3.3f);
		deepCopy.setIvalue(3);
		deepCopy.setName("��ȸ���Copy");
		deepCopy.getAnotherDeepObject().setName("anotherDeepCopy");
		deepCopy.getAnotherDeepObject().setIvalue(3);
		deepCopy.getAnotherDeepObject().setFvalue(3.3f);
		/**
		 * ���		
		 * DeepPrototype [name=��ȸ���, ivalue=1, fvalue=1.1, anotherDeepObject=AnotherDeepObject [name=anotherDeep, ivalue=2, fvalue=2.2]]
		 * DeepPrototype [name=��ȸ���Copy, ivalue=3, fvalue=3.3, anotherDeepObject=AnotherDeepObject [name=anotherDeepCopy, ivalue=3, fvalue=3.3]]
		 * DeepPrototype [name=��ȸ���, ivalue=1, fvalue=1.1, anotherDeepObject=AnotherDeepObject [name=anotherDeep, ivalue=2, fvalue=2.2]]

		 */
		System.out.println(deepCopy);
		System.out.println(deepPrototype);
		/**
		 * ���ۣ���ȸ��ƿ��Դ�ԭ���и���ֵ���͵ĳ�Ա�������������͵���
		 */
		
		
		
		
	}
	
	
	
}
