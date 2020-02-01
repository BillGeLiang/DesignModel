package interpreterPattern.expression;

import java.util.HashMap;

/**
 * 加法表达式
 * @author BillGL
 *
 */
public class AddExpression extends SymbolExpression {

	public AddExpression(Expression left, Expression right) {
		super(left, right);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int interpreter(HashMap<String, Integer> var) {
		//解析左边表达式的结果和右边表达式的结果，并相加得出结果
		return super.left.interpreter(var)+super.right.interpreter(var);
	}

}
