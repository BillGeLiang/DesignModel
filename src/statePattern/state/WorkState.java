package statePattern.state;

import statePattern.context.ContextWork;

/**
 * 工作抽象类
 * 
 * @author BillGL
 *
 */
public abstract class WorkState {
//	protected ContextWork contextWork;
	/**
	 * 状态具体实施的工作
	 */
	public abstract void handle(ContextWork contextWork);

}
