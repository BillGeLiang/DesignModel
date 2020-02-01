package interpreterPattern.expression;

import java.util.HashMap;

/**
 * ���ս��������������ʽ
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
