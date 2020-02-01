package interpreterPattern.expression;

import java.util.HashMap;

/**
 * 抽象类表达式
 * @author BillGL
 *
 */
public abstract class Expression {
	/**
	 * 解析表达式,并依据传入的参数-具体值实现表达式的赋值运算
	 * @param expStr
	 */
	public abstract int interpreter(HashMap<String,Integer> var);
}
