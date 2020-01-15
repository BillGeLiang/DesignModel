package visitorPattern.element;

import visitorPattern.visitor.VisitorOption;

/**
 * ���ι��ߣ����еĽṹ�����Ժͷ����������ǽ�Ϊ�ȶ��ģ�������һ���ι��߷����������
 * @author BillGL
 *
 */
public abstract class ElementPerson {
	private String name;
	private String description;
	
	/**
	 * ����һ���ι���
	 * @param visitor
	 */
	public abstract void accept(VisitorOption visitor);

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	
	public void choice(){
		System.out.println("��Ը�⣡��");
	}
	
	
}
