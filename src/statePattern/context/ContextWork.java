package statePattern.context;

import statePattern.state.MorningWorkState;
import statePattern.state.WorkState;

/**
 * ������
 * 
 * @author BillGL
 *
 */
public class ContextWork {
	private WorkState state;
	private int workHour;

	public ContextWork(int workHour) {
		state=new MorningWorkState();//��ʼ������״̬
		this.workHour = workHour;
	}

	public WorkState getState() {
		return state;
	}

	public void setState(WorkState state) {
		this.state = state;
	}

	public int getWorkHour() {
		return workHour;
	}

	public void setWorkHour(int workHour) {
		this.workHour = workHour;
	}
	
	public void doWork(){
		state.handle(this);
	}

}
