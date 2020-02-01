package mediatorPattern.colleague;

import mediatorPattern.mediator.MediatorUN;
/**
 * 伊朗国家
 * @author BillGL
 *
 */
public class ColleagueIran extends ColleagueCountry {
	private MediatorUN mediatorUN;

	public ColleagueIran(MediatorUN mediatorUN) {
		super();
		this.mediatorUN = mediatorUN;
	}

	@Override
	public void sendMessg(String messg) {
		mediatorUN.sendMessg(messg, this);
	}

	@Override
	public void reply(String otherMessg) {
		System.out.println("你的要求'"+otherMessg+"'伊朗已经收到");

	}

}
