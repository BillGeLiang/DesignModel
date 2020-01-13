package statePattern.state;

import statePattern.context.ContextWork;

/**
 * �����ϰ�״̬
 * @author BillGL
 *
 */
public class AfternoonWorkState extends WorkState{

	@Override
	public void handle(ContextWork contextWork) {
		int hour=contextWork.getWorkHour();
		if(hour<17){
			System.out.println("��ǰʱ�䣺"+hour+"�����ϰ�ʱ��");
		}
		else{
			contextWork.setState(new EveningWorkState());
			contextWork.doWork();//�ǳ���Ҫ
		}
			
	}

}
