package mediatorPattern.mediator;

import mediatorPattern.colleague.ColleagueCountry;

public abstract class Mediator {
	/**
	 * 代表某个对象传递消息
	 * @param messg
	 */
	public abstract void sendMessg(String messg,ColleagueCountry country);
}
