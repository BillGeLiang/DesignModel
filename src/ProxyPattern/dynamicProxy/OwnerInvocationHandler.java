package ProxyPattern.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * �û����������������޸��Լ��Ļ�����Ϣ�����ǲ����޸��Լ���õ����ۡ�hotRate����
 * 
 * @author BillGL
 *
 */
public class OwnerInvocationHandler implements InvocationHandler {
	private PersonBean personTarget;

	public OwnerInvocationHandler(PersonBean personTarget) {
		super();
		this.personTarget = personTarget;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws IllegalAccessException {
		try {
			if (method.getName().startsWith("get")) {//����ʹ��get����
				return method.invoke(personTarget, args);
			}
			if (method.getName().equals("setHotRate")) {//�޸����۷���ʱ����׳��쳣
				throw new IllegalAccessException();
			}
			if (method.getName().startsWith("set")) {//����ʹ�ó��޸����۷������set����
				return method.invoke(personTarget, args);
			}
		}  catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;// �������෽��
	}

}
