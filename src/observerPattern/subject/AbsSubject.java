package observerPattern.subject;

import java.util.ArrayList;
import java.util.List;

import observerPattern.observer.AbsObserver;

/**
 * ����������
 * @author BillGL
 *
 */
public abstract class AbsSubject {
	private String state="�ϰ�û��";
	protected List<AbsObserver> obList=new ArrayList<>();
	
	/**
	 * ��ӹ۲���
	 * @param observer
	 */
	public void addObserver(AbsObserver observer){
		obList.add(observer);
	}
	
	/**
	 * �Ƴ��۲���
	 * @param observer
	 */
	public void removeObserver(AbsObserver observer){
		obList.remove(observer);
	}

	/**
	 * ֪ͨ��Ϣ
	 */
	public abstract void notifyOb();
	
	
	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	
	
}
