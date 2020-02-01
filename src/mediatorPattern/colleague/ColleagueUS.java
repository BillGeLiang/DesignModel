package mediatorPattern.colleague;

import mediatorPattern.mediator.MediatorUN;

/**
 * 美国国家
 * @author BillGL
 *
 */
public class ColleagueUS extends ColleagueCountry {
	private MediatorUN mediatorUN;
	private String messg;

	public ColleagueUS(MediatorUN mediatorUN) {
		super();
		this.mediatorUN = mediatorUN;
	}

	@Override
	public void sendMessg(String messg) {
		this.messg=messg;
		mediatorUN.sendMessg(messg, this);
	}

	@Override
	public void reply(String otherMessg) {
		System.out.println("你的要求'"+otherMessg+"'美国已经收到");
		
	}

}
