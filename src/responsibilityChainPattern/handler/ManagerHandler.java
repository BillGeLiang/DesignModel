package responsibilityChainPattern.handler;

import responsibilityChainPattern.request.Request;

/**
 * ��������
 * @author BillGL
 *
 */
public class ManagerHandler extends PositionHandler {

	@Override
	public void handleRequest(Request request) {
		System.out.println("===============���������������Ե�Ƭ��.......");
		System.out.println("�������󣺡�"+request.getNum()+"\t"+request.getRequestType()+"��");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(request.getRequestType().equals("��н")&&request.getNum()>1000){
			
				System.out.println("����!");
				System.out.println(request.getNum()+"\t"+request.getRequestType());
			
		}
		else{
			System.out.println("���ڷ���Χ���˻�");//���Ȩ���ߣ����봦������
		}
		
	}

}
