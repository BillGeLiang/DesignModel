package interpreterPattern.expression;

import java.util.HashMap;

/**
 * �������ʽ
 * @author BillGL
 *
 */
public class SubExpression extends SymbolExpression {

	public SubExpression(Expression left, Expression right) {
		super(left, right);
		
	}

	@Override
	public int interpreter(HashMap<String, Integer> var) {
		//������߱��ʽ�Ľ�����ұ߱��ʽ�Ľ����������ó����
		return super.left.interpreter(var)-super.right.interpreter(var);
	}
	
	

}
