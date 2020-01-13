package statePattern.state;

import statePattern.context.ContextWork;

/**
 * 下午上班状态
 * @author BillGL
 *
 */
public class AfternoonWorkState extends WorkState{

	@Override
	public void handle(ContextWork contextWork) {
		int hour=contextWork.getWorkHour();
		if(hour<17){
			System.out.println("当前时间："+hour+"下午上班时间");
		}
		else{
			contextWork.setState(new EveningWorkState());
			contextWork.doWork();//非常重要
		}
			
	}

}
