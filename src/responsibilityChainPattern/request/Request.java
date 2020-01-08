package responsibilityChainPattern.request;

/**
 * «Î«Û
 * @author BillGL
 *
 */
public class Request {
	private String requestType;
	private int num;
	
	
	
	public Request(String requestType, int num) {
		super();
		this.requestType = requestType;
		this.num = num;
	}
	public String getRequestType() {
		return requestType;
	}
	public void setRequestType(String requestType) {
		this.requestType = requestType;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	
	
}
