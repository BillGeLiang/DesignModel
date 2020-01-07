package observerPattern.subject;

import java.util.List;

import observerPattern.observer.AbsObserver;

/**
 * 前台
 * @author BillGL
 *
 */
public class FrontDesk extends AbsSubject{

	/**
	 * 通知观察者
	 */
	@Override
	public void notifyOb() {
		// TODO Auto-generated method stub
		List<AbsObserver> list=super.obList;
		for(int i=0;i<list.size();i++){
			list.get(i).update();
		}
	}

}
