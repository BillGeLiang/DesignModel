package combinationPattern.safePattern;

import java.util.ArrayList;

import combinationPattern.openPattern.Corp;

public class Branch extends AbsCorp {
	private ArrayList<AbsCorp> ordinateList=new ArrayList<>();
	
	public Branch(String name, String description) {
		super(name, description);
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * 新增节点
	 * @param corp
	 */
	public void addSubordinate(AbsCorp corp) {
		// TODO Auto-generated method stub
		ordinateList.add(corp);
	}

	
	/**
	 * 去除节点
	 * @param corp
	 */
	public void remove(Corp corp) {
		// TODO Auto-generated method stub
		ordinateList.remove(corp);
	}

	/**
	 * 获取节点列表
	 * @return
	 */
	public ArrayList<AbsCorp> getSubordinate() {
		// TODO Auto-generated method stub
		return ordinateList;
	}


}
