package ProxyPattern.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
/**
 * 
 * 其他用户的启动处理器
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
			if(method.getName().startsWith("get"))//允许访问所有get方法
				return method.invoke(personTarget, args);//允许修改他人的评价内容
			if(method.getName().equals("setHotRate"))
				return method.invoke(personTarget, args);
			if(method.getName().startsWith("set")){//修改他人的基本信息，则抛出异常
				throw new IllegalAccessException();
			}
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}	
		return null;//忽略其他方法
	}

}
