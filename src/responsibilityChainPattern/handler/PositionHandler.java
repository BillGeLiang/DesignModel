package responsibilityChainPattern.handler;

import responsibilityChainPattern.request.Request;

/**
 * 职位处理器
 * @author BillGL
 *
 */
public abstract class PositionHandler {
	protected PositionHandler superior;
	public void setSuperior(PositionHandler handler){
		superior=handler;
	}
	
	public abstract void handleRequest(Request request);
}
