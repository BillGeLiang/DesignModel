package mediatorPattern.mediator;

import mediatorPattern.colleague.ColleagueCountry;
import mediatorPattern.colleague.ColleagueIran;
import mediatorPattern.colleague.ColleagueUS;
/**
 * ���Ϲ��н���
 * @author BillGL
 *
 */
public class MediatorUN extends Mediator {

	/**
	 * ��Ҫ��ȡί���Լ�Ϊ�н�����ж���
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
		 * ָ������֮��Ĺ�ϵ��������Ϣ���ݸ�ָ��������ɽ���
		 */
		if (country == us) {// ��������˼���������
			iran.reply(messg);
		}
		if (country == iran) {// ��������˼���������
			us.reply(messg);
		}

	}
}
