package combinationPattern.openPattern;

import java.util.ArrayList;

/**
 * 职员
 * @author BillGL
 *
 */
public class Clerk_leaf extends Corp{

	public Clerk_leaf(String name, String description) {
		super(name, description);
		
	}

	/**
	 * 叶子节点不需要使用这种方法;@Deprecated表示在编译器告诉调用者，该方法已经失效了，虽然可以调用但是会抛出异常
	 */
	@Override
	@Deprecated
	public void addSubordinate(Corp corp) {
		throw new UnsupportedOperationException();
		
	}
	/**
	 * 叶子节点不需要使用这种方法
	 */
	@Override
	@Deprecated
	public void remove(Corp corp) {
		throw new UnsupportedOperationException();
		
	}

	/**
	 * 叶子节点不需要使用这种方法
	 */
	@Override
	@Deprecated
	public ArrayList<Corp> getSubordinate() {
		throw new UnsupportedOperationException();
	}

}
