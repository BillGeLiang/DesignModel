package combinationPattern.openPattern;

import java.util.ArrayList;

/**
 * ְԱ
 * @author BillGL
 *
 */
public class Clerk_leaf extends Corp{

	public Clerk_leaf(String name, String description) {
		super(name, description);
		
	}

	/**
	 * Ҷ�ӽڵ㲻��Ҫʹ�����ַ���;@Deprecated��ʾ�ڱ��������ߵ����ߣ��÷����Ѿ�ʧЧ�ˣ���Ȼ���Ե��õ��ǻ��׳��쳣
	 */
	@Override
	@Deprecated
	public void addSubordinate(Corp corp) {
		throw new UnsupportedOperationException();
		
	}
	/**
	 * Ҷ�ӽڵ㲻��Ҫʹ�����ַ���
	 */
	@Override
	@Deprecated
	public void remove(Corp corp) {
		throw new UnsupportedOperationException();
		
	}

	/**
	 * Ҷ�ӽڵ㲻��Ҫʹ�����ַ���
	 */
	@Override
	@Deprecated
	public ArrayList<Corp> getSubordinate() {
		throw new UnsupportedOperationException();
	}

}
