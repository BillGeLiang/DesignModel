package prototyoe.deepCopy;

/**
 * 深度复制原型对象
 * @author BillGL
 *
 */
public class DeepPrototype implements Cloneable{
	private String name;
	private int ivalue;
	private float fvalue;
	private AnotherDeepObject anotherDeepObject;
	
	
	public DeepPrototype() {
		super();
		// TODO Auto-generated constructor stub
	}


	public DeepPrototype(String name, int ivalue, float fvalue,
			AnotherDeepObject anotherDeepObject) {
		super();
		this.name = name;
		this.ivalue = ivalue;
		this.fvalue = fvalue;
		this.anotherDeepObject = anotherDeepObject;
	}
	
	
	@Override
	public DeepPrototype clone() throws CloneNotSupportedException{
		DeepPrototype deep=null;
		deep=(DeepPrototype) super.clone();
		/**
		 * 实现深度复制:将引用类型对象也复制一份
		 */
		deep.anotherDeepObject=this.anotherDeepObject.clone();
		return deep;
	}
	
	


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getIvalue() {
		return ivalue;
	}


	public void setIvalue(int ivalue) {
		this.ivalue = ivalue;
	}


	public float getFvalue() {
		return fvalue;
	}


	public void setFvalue(float fvalue) {
		this.fvalue = fvalue;
	}


	public AnotherDeepObject getAnotherDeepObject() {
		return anotherDeepObject;
	}


	public void setAnotherDeepObject(AnotherDeepObject anotherDeepObject) {
		this.anotherDeepObject = anotherDeepObject;
	}


	@Override
	public String toString() {
		return "DeepPrototype [name=" + name + ", ivalue=" + ivalue
				+ ", fvalue=" + fvalue + ", anotherDeepObject="
				+ anotherDeepObject + "]";
	}
	
}
