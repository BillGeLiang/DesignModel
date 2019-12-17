package prototypePattern.shadowCopy;

public class AnotherShadowObject {
	private String key;
	private int inumber;
	private float fnumber;
	
	public AnotherShadowObject() {
		super();
	}
	
	public AnotherShadowObject(String key, int inumber, float fnumber) {
		super();
		this.key = key;
		this.inumber = inumber;
		this.fnumber = fnumber;
	}
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public int getInumber() {
		return inumber;
	}
	public void setInumber(int inumber) {
		this.inumber = inumber;
	}
	public float getFnumber() {
		return fnumber;
	}
	public void setFnumber(float fnumber) {
		this.fnumber = fnumber;
	}
	@Override
	public String toString() {
		return "AnotherShadowObject [key=" + key + ", inumber=" + inumber
				+ ", fnumber=" + fnumber + "]";
	}
	
	
	
}
