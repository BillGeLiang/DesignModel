package statePattern.state;

import statePattern.context.ContextWork;

/**
 * 午餐工作状态
 * @author BillGL
 *
 */
public class NoonWorkState extends WorkState{

	@Override
	public void handle(ContextWork contextWork) {
		int hour=contextWork.getWorkHour();
		if(hour<13)
			System.out.println("午间用餐时间,顺带休息和午休");
		else
		{
			/**
			 * 设置下一状态，并执行工作
			 */
			contextWork.setState(new AfternoonWorkState());
			contextWork.doWork();//非常重要
		}
			
	}

}
