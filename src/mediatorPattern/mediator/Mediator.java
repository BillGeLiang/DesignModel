package mediatorPattern.mediator;

import mediatorPattern.colleague.ColleagueCountry;

public abstract class Mediator {
	/**
	 * ����ĳ�����󴫵���Ϣ
	 * @param messg
	 */
	public abstract void sendMessg(String messg,ColleagueCountry country);
}
