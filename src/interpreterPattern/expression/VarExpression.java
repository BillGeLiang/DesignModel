package interpreterPattern.expression;

import java.util.HashMap;
/**
 * 参数表达式
 * @author BillGL
 *
 */
public class VarExpression extends Expression {
	private String key;
	
	
	public VarExpression(String key) {
		super();
		this.key = key;
	}


	/**
	 * 解析表达式中对应参数的值
	 */
	@Override
	public int interpreter(HashMap<String, Integer> var) {
		// TODO Auto-generated method stub
		return var.get(key);
	}

}
