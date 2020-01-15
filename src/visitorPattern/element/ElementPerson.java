package visitorPattern.element;

import visitorPattern.visitor.VisitorOption;

/**
 * 被参观者，当中的结构（属性和方法）必须是较为稳定的，并开放一个参观者方法供其访问
 * @author BillGL
 *
 */
public abstract class ElementPerson {
	private String name;
	private String description;
	
	/**
	 * 接受一个参观者
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
		System.out.println("我愿意！！");
	}
	
	
}
