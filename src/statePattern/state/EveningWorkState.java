package statePattern.state;

import statePattern.context.ContextWork;

/**
 * 晚上工作时间
 * @author BillGL
 *
 */
public class EveningWorkState extends WorkState{

	@Override
	public void handle(ContextWork contextWork) {
		int hour=contextWork.getWorkHour();;
		if(hour<21){
			System.out.println("当前时间："+hour+"夜间工作时间");
		}
		else{
			contextWork.setState(new OffWorkState());
			contextWork.doWork();//非常重要
		}
		
	}

}
