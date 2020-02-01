package interpreterPattern.expression;

import java.util.HashMap;

/**
 * 减法表达式
 * @author BillGL
 *
 */
public class SubExpression extends SymbolExpression {

	public SubExpression(Expression left, Expression right) {
		super(left, right);
		
	}

	@Override
	public int interpreter(HashMap<String, Integer> var) {
		//解析左边表达式的结果和右边表达式的结果，并相减得出结果
		return super.left.interpreter(var)-super.right.interpreter(var);
	}
	
	

}
