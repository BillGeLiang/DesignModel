package ProxyPattern.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * 用户自身处理器（允许修改自己的基本信息，但是不能修改自己获得的评价【hotRate】）
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
			if (method.getName().startsWith("get")) {//可以使用get方法
				return method.invoke(personTarget, args);
			}
			if (method.getName().equals("setHotRate")) {//修改评价方法时候会抛出异常
				throw new IllegalAccessException();
			}
			if (method.getName().startsWith("set")) {//可以使用除修改评价方法外的set方法
				return method.invoke(personTarget, args);
			}
		}  catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;// 忽略其余方法
	}

}
