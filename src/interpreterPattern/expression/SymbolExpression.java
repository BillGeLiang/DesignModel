package interpreterPattern.expression;

import java.util.HashMap;

/**
 * 非终结符（运算符）表达式
 * @author BillGL
 *
 */
public abstract class SymbolExpression extends Expression {
	protected Expression left;
	protected Expression right;

	public SymbolExpression(Expression left, Expression right) {
		super();
		this.left = left;
		this.right = right;
	}
}
