package interpreterPattern.expression;

import java.util.HashMap;

/**
 * �ӷ����ʽ
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
		//������߱��ʽ�Ľ�����ұ߱��ʽ�Ľ��������ӵó����
		return super.left.interpreter(var)+super.right.interpreter(var);
	}

}
