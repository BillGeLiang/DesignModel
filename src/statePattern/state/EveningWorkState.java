package statePattern.state;

import statePattern.context.ContextWork;

/**
 * ���Ϲ���ʱ��
 * @author BillGL
 *
 */
public class EveningWorkState extends WorkState{

	@Override
	public void handle(ContextWork contextWork) {
		int hour=contextWork.getWorkHour();;
		if(hour<21){
			System.out.println("��ǰʱ�䣺"+hour+"ҹ�乤��ʱ��");
		}
		else{
			contextWork.setState(new OffWorkState());
			contextWork.doWork();//�ǳ���Ҫ
		}
		
	}

}
