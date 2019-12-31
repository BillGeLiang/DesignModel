package combinationPattern.openPattern;

import java.util.ArrayList;

public abstract class Corp {
	private String name;
	private String description;
	
	public void getInfo(){
		System.out.println("name:\t"+name+"\tdescription:\t"+description);
	}
	
	
	
	
	public Corp(String name, String description) {
		super();
		this.name = name;
		this.description = description;
	}




	/**
	 * 添加子节点
	 * @param corp
	 */
	public abstract void addSubordinate(Corp corp) ;
	
	
	/**
	 * 去除子节点
	 * @param corp
	 */
	public abstract void remove(Corp corp);
	
	/**
	 * 获取分支下所有子节点和叶子节点
	 * @return
	 */
	public abstract ArrayList<Corp> getSubordinate();
}
