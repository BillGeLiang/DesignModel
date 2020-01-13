package statePattern.state;

import statePattern.context.ContextWork;

/**
 * �°�״̬
 * 
 * @author BillGL
 *
 */
public class OffWorkState extends WorkState {

	@Override
	public void handle(ContextWork contextWork) {
		
		int hour = contextWork.getWorkHour();
		System.out.println("��ǰʱ��Ϊ��" + hour + ":00\t��ʱ���°���");
	}

}
