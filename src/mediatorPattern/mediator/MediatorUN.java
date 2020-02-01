package mediatorPattern.mediator;

import mediatorPattern.colleague.ColleagueCountry;
import mediatorPattern.colleague.ColleagueIran;
import mediatorPattern.colleague.ColleagueUS;
/**
 * 联合国中介者
 * @author BillGL
 *
 */
public class MediatorUN extends Mediator {

	/**
	 * 需要获取委托自己为中介的所有对象
	 */
	private ColleagueUS us;
	private ColleagueIran iran;

	public void setUs(ColleagueUS us) {
		this.us = us;
	}

	public void setIran(ColleagueIran iran) {
		this.iran = iran;
	}

	@Override
	public void sendMessg(String messg, ColleagueCountry country) {
		/**
		 * 指定对象之间的关系，并将信息传递给指定对象，完成交互
		 */
		if (country == us) {// 将美国意思传达给伊朗
			iran.reply(messg);
		}
		if (country == iran) {// 将伊朗意思传达给美国
			us.reply(messg);
		}

	}
}
