package responsibilityChainPattern.handler;

import responsibilityChainPattern.request.Request;

/**
 * 经理处理器
 * @author BillGL
 *
 */
public class ManagerHandler extends PositionHandler {

	@Override
	public void handleRequest(Request request) {
		System.out.println("===============》交给经理处理，请稍等片刻.......");
		System.out.println("接收请求：【"+request.getNum()+"\t"+request.getRequestType()+"】");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(request.getRequestType().equals("加薪")&&request.getNum()>1000){
			
				System.out.println("允许!");
				System.out.println(request.getNum()+"\t"+request.getRequestType());
			
		}
		else{
			System.out.println("不在服务范围，退回");//最高权限者，必须处理请求
		}
		
	}

}
