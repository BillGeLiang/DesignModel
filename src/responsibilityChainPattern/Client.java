package responsibilityChainPattern;

import responsibilityChainPattern.handler.MajordomoHandler;
import responsibilityChainPattern.handler.ManagerHandler;
import responsibilityChainPattern.handler.PositionHandler;
import responsibilityChainPattern.request.Request;

public class Client {
	public static void main(String[] args){
		/**
		 * 结果：
		 * ===============》交给总监处理
			接收请求：【1000	加薪】
			批准
			===============》交给总监处理
			接收请求：【5000	加薪】
			权限不足，需要上报
			===============》交给经理处理，请稍等片刻.......
			接收请求：【5000	加薪】
			允许!
			5000	加薪
			===============》交给总监处理
			接收请求：【2	请假】
			权限不足，需要上报
			===============》交给经理处理，请稍等片刻.......
			接收请求：【2	请假】
			不在服务范围，退回

		 */
		PositionHandler manager=new ManagerHandler();
		PositionHandler mojordomo=new MajordomoHandler();
		/**
		 * 总监的上级是经理
		 */
		mojordomo.setSuperior(manager);
		Request req1=new Request("加薪",1000);
		Request req2=new Request("加薪", 5000);
		Request req3=new Request("请假",2);
		
		/**
		 * 职员需要向上级报告（总监），不能越级.
		 */
		mojordomo.handleRequest(req1);
		mojordomo.handleRequest(req2);
		mojordomo.handleRequest(req3);
	}
}
