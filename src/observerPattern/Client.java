package observerPattern;

import observerPattern.observer.AbsObserver;
import observerPattern.observer.OfficerA;
import observerPattern.observer.OfficerB;
import observerPattern.subject.AbsSubject;
import observerPattern.subject.FrontDesk;

public class Client {
	public static void main(String[] args){
		
		/**
		 * 结果：
		 * name为：办公室员工A现在前台的状态为：老板来了
			开始工作
			name为：办公室员工B现在前台的状态为：老板来了
			开始工作
			======================>
			name为：办公室员工A现在前台的状态为：老板没来
			娱乐活动
			name为：办公室员工B现在前台的状态为：老板没来
			娱乐活动
		 */
		FrontDesk frontDesk=new FrontDesk();
		/**
		 * 观察者依赖主题
		 */
		AbsObserver officerA=new OfficerA(frontDesk);
		AbsObserver officerB=new OfficerB(frontDesk);
		/**
		 * 添加观察者
		 */
		frontDesk.addObserver(officerA);
		frontDesk.addObserver(officerB);
		
		/**
		 * 设置主题状态、通知观察者
		 */
		frontDesk.setState("老板来了");
		frontDesk.notifyOb();
		System.out.println("======================>");
		frontDesk.setState("老板没来");
		frontDesk.notifyOb();
		
	}
}
