package statePattern.state;

import statePattern.context.ContextWork;

/**
 * ��͹���״̬
 * @author BillGL
 *
 */
public class NoonWorkState extends WorkState{

	@Override
	public void handle(ContextWork contextWork) {
		int hour=contextWork.getWorkHour();
		if(hour<13)
			System.out.println("����ò�ʱ��,˳����Ϣ������");
		else
		{
			/**
			 * ������һ״̬����ִ�й���
			 */
			contextWork.setState(new AfternoonWorkState());
			contextWork.doWork();//�ǳ���Ҫ
		}
			
	}

}
