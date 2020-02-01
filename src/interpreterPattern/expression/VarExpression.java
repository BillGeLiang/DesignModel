package interpreterPattern.expression;

import java.util.HashMap;
/**
 * �������ʽ
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
	 * �������ʽ�ж�Ӧ������ֵ
	 */
	@Override
	public int interpreter(HashMap<String, Integer> var) {
		// TODO Auto-generated method stub
		return var.get(key);
	}

}
