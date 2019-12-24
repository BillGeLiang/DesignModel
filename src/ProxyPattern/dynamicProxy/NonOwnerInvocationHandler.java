package ProxyPattern.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
/**
 * 
 * �����û�������������
 * @author BillGL
 *
 */
public class NonOwnerInvocationHandler implements InvocationHandler {
	private PersonBean personTarget;
	
	
	public NonOwnerInvocationHandler(PersonBean personTarget) {
		super();
		this.personTarget = personTarget;
	}


	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws IllegalAccessException {
		try {
			if(method.getName().startsWith("get"))//�����������get����
				return method.invoke(personTarget, args);//�����޸����˵���������
			if(method.getName().equals("setHotRate"))
				return method.invoke(personTarget, args);
			if(method.getName().startsWith("set")){//�޸����˵Ļ�����Ϣ�����׳��쳣
				throw new IllegalAccessException();
			}
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}	
		return null;//������������
	}

}
