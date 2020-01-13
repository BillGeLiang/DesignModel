package statePattern.state;

import statePattern.context.ContextWork;

/**
 * 下班状态
 * 
 * @author BillGL
 *
 */
public class OffWorkState extends WorkState {

	@Override
	public void handle(ContextWork contextWork) {
		
		int hour = contextWork.getWorkHour();
		System.out.println("当前时间为：" + hour + ":00\t够时间下班了");
	}

}
