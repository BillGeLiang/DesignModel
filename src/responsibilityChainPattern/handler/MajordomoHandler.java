package responsibilityChainPattern.handler;

import responsibilityChainPattern.request.Request;

/**
 * �ܼദ����
 * @author BillGL
 *
 */
public class MajordomoHandler extends PositionHandler{

	@Override
	public void handleRequest(Request request) {
		System.out.println("===============�������ܼദ��");
		System.out.println("�������󣺡�"+request.getNum()+"\t"+request.getRequestType()+"��");
		if(request.getRequestType().equals("��н")&&(request.getNum()>=500&&request.getNum()<=1000)){
			System.out.println("��׼");
			
		}
		else{
			System.out.println("Ȩ�޲��㣬��Ҫ�ϱ�");
			superior.handleRequest(request);
		}
		
	}

}
