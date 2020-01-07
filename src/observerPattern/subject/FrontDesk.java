package observerPattern.subject;

import java.util.List;

import observerPattern.observer.AbsObserver;

/**
 * ǰ̨
 * @author BillGL
 *
 */
public class FrontDesk extends AbsSubject{

	/**
	 * ֪ͨ�۲���
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
