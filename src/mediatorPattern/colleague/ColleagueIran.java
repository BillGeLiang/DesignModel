package mediatorPattern.colleague;

import mediatorPattern.mediator.MediatorUN;
/**
 * ���ʹ���
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
		System.out.println("���Ҫ��'"+otherMessg+"'�����Ѿ��յ�");

	}

}
