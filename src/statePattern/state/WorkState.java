package statePattern.state;

import statePattern.context.ContextWork;

/**
 * ����������
 * 
 * @author BillGL
 *
 */
public abstract class WorkState {
//	protected ContextWork contextWork;
	/**
	 * ״̬����ʵʩ�Ĺ���
	 */
	public abstract void handle(ContextWork contextWork);

}
