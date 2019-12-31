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
	 * ����ӽڵ�
	 * @param corp
	 */
	public abstract void addSubordinate(Corp corp) ;
	
	
	/**
	 * ȥ���ӽڵ�
	 * @param corp
	 */
	public abstract void remove(Corp corp);
	
	/**
	 * ��ȡ��֧�������ӽڵ��Ҷ�ӽڵ�
	 * @return
	 */
	public abstract ArrayList<Corp> getSubordinate();
}
