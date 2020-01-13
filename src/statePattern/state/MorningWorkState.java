package statePattern.state;

import statePattern.context.ContextWork;

/**
 * ���Ϲ���ʱ��
 * @author BillGL
 *
 */
public class MorningWorkState extends WorkState{

	@Override
	public void handle(ContextWork contextWork) {
		int hour=contextWork.getWorkHour();
		if(hour<12){
			System.out.println("��ǰʱ�䣺"+hour+"���繤��ʱ��");
		}
		else{
			contextWork.setState(new NoonWorkState());
			contextWork.doWork();//�ǳ���Ҫ
		}
			
		
	}

}
