package statePattern.state;

import statePattern.context.ContextWork;

/**
 * 早上工作时间
 * @author BillGL
 *
 */
public class MorningWorkState extends WorkState{

	@Override
	public void handle(ContextWork contextWork) {
		int hour=contextWork.getWorkHour();
		if(hour<12){
			System.out.println("当前时间："+hour+"上午工作时间");
		}
		else{
			contextWork.setState(new NoonWorkState());
			contextWork.doWork();//非常重要
		}
			
		
	}

}
