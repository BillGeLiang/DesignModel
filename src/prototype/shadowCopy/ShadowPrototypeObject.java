package prototype.shadowCopy;

/**
 * 浅拷贝原型对象
 * 
 * @author BillGL
 *
 */
public class ShadowPrototypeObject implements Cloneable {
	private String name;
	private int ivalue;
	private float fvalue;
	private AnotherShadowObject anotherShadowObject;

	public ShadowPrototypeObject(String name, int ivalue, float fvalue,
			AnotherShadowObject anotherShadowObject) {
		super();
		this.name = name;
		this.ivalue = ivalue;
		this.fvalue = fvalue;
		this.anotherShadowObject = anotherShadowObject;
	}

	/**
	 * 覆盖clone方法
	 * 
	 * @throws CloneNotSupportedException
	 */
	@Override
	public ShadowPrototypeObject clone() throws CloneNotSupportedException {
		ShadowPrototypeObject prototype = null;
		prototype = (ShadowPrototypeObject) super.clone();
		return prototype;

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

	public AnotherShadowObject getAnotherShadowObject() {
		return anotherShadowObject;
	}

	public void setAnotherShadowObject(AnotherShadowObject anotherShadowObject) {
		this.anotherShadowObject = anotherShadowObject;
	}

	@Override
	public String toString() {
		return "ShadowObject [name=" + name + ", ivalue=" + ivalue
				+ ", fvalue=" + fvalue + ", anotherShadowObject="
				+ anotherShadowObject + "]";
	}

}
