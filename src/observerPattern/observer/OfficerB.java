package observerPattern.observer;

import observerPattern.subject.FrontDesk;

/**
 * 办公室员工B
 * @author BillGL
 *
 */
public class OfficerB extends AbsObserver {
	private String name="办公室员工B";
	private FrontDesk frontDesk;
	
	
	
	
	public OfficerB(FrontDesk frontDesk) {
		super();
		this.frontDesk = frontDesk;
	}




	@Override
	public void update() {
		String state=frontDesk.getState();
		System.out.println("name为："+name+"现在前台的状态为："+state);
		if(state.equals("老板来了"))
			System.out.println("开始工作");
		if(state.equals("老板没来"))
			System.out.println("娱乐活动");
	}
}
