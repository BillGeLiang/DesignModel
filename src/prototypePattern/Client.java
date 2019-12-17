package prototypePattern;

import prototypePattern.deepCopy.AnotherDeepObject;
import prototypePattern.deepCopy.DeepPrototype;
import prototypePattern.shadowCopy.AnotherShadowObject;
import prototypePattern.shadowCopy.ShadowPrototypeObject;

public class Client {
	
	public static void main(String[] args) throws CloneNotSupportedException{
		/**
		 * 浅拷贝
		 */
//		AnotherShadowObject anotherObject=new AnotherShadowObject("anotherObject",3,4.5f);
//		ShadowPrototypeObject prototype=new ShadowPrototypeObject("浅拷贝", 2, 2.4f, anotherObject);
//		System.out.println(prototype);
//		
//		ShadowPrototypeObject copy=prototype.clone();
//		copy.setName("浅拷贝copy");
//		copy.setIvalue(7);
//		copy.getAnotherShadowObject().setKey("anotherObjectCopy");
//		copy.getAnotherShadowObject().setInumber(7);
//		copy.getAnotherShadowObject().setFnumber(7.7f);
		/**
		 * 结果：
		 * ShadowObject [name=浅拷贝, ivalue=2, fvalue=2.4, anotherShadowObject=AnotherShadowObject [key=anotherObject, inumber=3, fnumber=4.5]]
		 * ShadowObject [name=浅拷贝copy, ivalue=7, fvalue=2.4, anotherShadowObject=AnotherShadowObject [key=anotherObjectCopy, inumber=7, fnumber=7.7]]
		 * ShadowObject [name=浅拷贝, ivalue=2, fvalue=2.4, anotherShadowObject=AnotherShadowObject [key=anotherObjectCopy, inumber=7, fnumber=7.7]]
		*/
//		System.out.println(copy);
//		System.out.println(prototype);
		/**
		 * 结论：浅克隆不会克隆引用类型对象，因此拷贝副本会与原型对象共享同一个引用类型对象的内存地址，副本改变引用对象，原型也会随之改变
		 */
		
		
		
		/*******************************深度拷贝*******************************************************************************/
		AnotherDeepObject anotherDeep=new AnotherDeepObject("anotherDeep", 2, 2.2f);
		DeepPrototype deepPrototype=new DeepPrototype("深度复制",1,1.1f,anotherDeep);
		System.out.println(deepPrototype);
		DeepPrototype deepCopy=deepPrototype.clone();
		deepCopy.setFvalue(3.3f);
		deepCopy.setIvalue(3);
		deepCopy.setName("深度复制Copy");
		deepCopy.getAnotherDeepObject().setName("anotherDeepCopy");
		deepCopy.getAnotherDeepObject().setIvalue(3);
		deepCopy.getAnotherDeepObject().setFvalue(3.3f);
		/**
		 * 结果		
		 * DeepPrototype [name=深度复制, ivalue=1, fvalue=1.1, anotherDeepObject=AnotherDeepObject [name=anotherDeep, ivalue=2, fvalue=2.2]]
		 * DeepPrototype [name=深度复制Copy, ivalue=3, fvalue=3.3, anotherDeepObject=AnotherDeepObject [name=anotherDeepCopy, ivalue=3, fvalue=3.3]]
		 * DeepPrototype [name=深度复制, ivalue=1, fvalue=1.1, anotherDeepObject=AnotherDeepObject [name=anotherDeep, ivalue=2, fvalue=2.2]]

		 */
		System.out.println(deepCopy);
		System.out.println(deepPrototype);
		/**
		 * 结论：深度复制可以从原型中复制值类型的成员变量和引用类型的类
		 */
		
		
		
		
	}
	
	
	
}
