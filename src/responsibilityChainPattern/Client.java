package responsibilityChainPattern;

import responsibilityChainPattern.handler.MajordomoHandler;
import responsibilityChainPattern.handler.ManagerHandler;
import responsibilityChainPattern.handler.PositionHandler;
import responsibilityChainPattern.request.Request;

public class Client {
	public static void main(String[] args){
		/**
		 * �����
		 * ===============�������ܼദ��
			�������󣺡�1000	��н��
			��׼
			===============�������ܼദ��
			�������󣺡�5000	��н��
			Ȩ�޲��㣬��Ҫ�ϱ�
			===============���������������Ե�Ƭ��.......
			�������󣺡�5000	��н��
			����!
			5000	��н
			===============�������ܼദ��
			�������󣺡�2	��١�
			Ȩ�޲��㣬��Ҫ�ϱ�
			===============���������������Ե�Ƭ��.......
			�������󣺡�2	��١�
			���ڷ���Χ���˻�

		 */
		PositionHandler manager=new ManagerHandler();
		PositionHandler mojordomo=new MajordomoHandler();
		/**
		 * �ܼ���ϼ��Ǿ���
		 */
		mojordomo.setSuperior(manager);
		Request req1=new Request("��н",1000);
		Request req2=new Request("��н", 5000);
		Request req3=new Request("���",2);
		
		/**
		 * ְԱ��Ҫ���ϼ����棨�ܼࣩ������Խ��.
		 */
		mojordomo.handleRequest(req1);
		mojordomo.handleRequest(req2);
		mojordomo.handleRequest(req3);
	}
}
