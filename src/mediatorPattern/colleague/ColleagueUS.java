package mediatorPattern.colleague;

import mediatorPattern.mediator.MediatorUN;

/**
 * ��������
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
		System.out.println("���Ҫ��'"+otherMessg+"'�����Ѿ��յ�");
		
	}

}
