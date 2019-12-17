package prototypePattern.deepCopy;

public class AnotherDeepObject implements Cloneable {
	private String name;
	private int ivalue;
	private float fvalue;

	public AnotherDeepObject() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AnotherDeepObject(String name, int ivalue, float fvalue) {
		super();
		this.name = name;
		this.ivalue = ivalue;
		this.fvalue = fvalue;
	}

	/**
	 * ¸²¸Çclone·½·¨
	 */
	@Override
	public AnotherDeepObject clone() throws CloneNotSupportedException {
		AnotherDeepObject another = (AnotherDeepObject) super.clone();
		return another;
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

	@Override
	public String toString() {
		return "AnotherDeepObject [name=" + name + ", ivalue=" + ivalue
				+ ", fvalue=" + fvalue + "]";
	}

}
