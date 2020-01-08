package responsibilityChainPattern.handler;

import responsibilityChainPattern.request.Request;

/**
 * 总监处理器
 * @author BillGL
 *
 */
public class MajordomoHandler extends PositionHandler{

	@Override
	public void handleRequest(Request request) {
		System.out.println("===============》交给总监处理");
		System.out.println("接收请求：【"+request.getNum()+"\t"+request.getRequestType()+"】");
		if(request.getRequestType().equals("加薪")&&(request.getNum()>=500&&request.getNum()<=1000)){
			System.out.println("批准");
			
		}
		else{
			System.out.println("权限不足，需要上报");
			superior.handleRequest(request);
		}
		
	}

}
