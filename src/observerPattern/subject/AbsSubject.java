package observerPattern.subject;

import java.util.ArrayList;
import java.util.List;

import observerPattern.observer.AbsObserver;

/**
 * 抽象主题类
 * @author BillGL
 *
 */
public abstract class AbsSubject {
	private String state="老板没来";
	protected List<AbsObserver> obList=new ArrayList<>();
	
	/**
	 * 添加观察者
	 * @param observer
	 */
	public void addObserver(AbsObserver observer){
		obList.add(observer);
	}
	
	/**
	 * 移除观察者
	 * @param observer
	 */
	public void removeObserver(AbsObserver observer){
		obList.remove(observer);
	}

	/**
	 * 通知信息
	 */
	public abstract void notifyOb();
	
	
	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	
	
}
