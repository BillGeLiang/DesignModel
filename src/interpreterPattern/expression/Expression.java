package interpreterPattern.expression;

import java.util.HashMap;

/**
 * ��������ʽ
 * @author BillGL
 *
 */
public abstract class Expression {
	/**
	 * �������ʽ,�����ݴ���Ĳ���-����ֵʵ�ֱ��ʽ�ĸ�ֵ����
	 * @param expStr
	 */
	public abstract int interpreter(HashMap<String,Integer> var);
}
