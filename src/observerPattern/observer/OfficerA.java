package observerPattern.observer;

import observerPattern.subject.FrontDesk;

/**
 * 办公室员工A
 * @author BillGL
 *
 */
public class OfficerA extends AbsObserver {
	private String name="办公室员工A";
	private FrontDesk frontDesk;
	
	
	
	
	public OfficerA(FrontDesk frontDesk) {
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
