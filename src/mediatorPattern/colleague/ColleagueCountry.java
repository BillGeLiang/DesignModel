package mediatorPattern.colleague;

public abstract class ColleagueCountry {
	
	/**
	 * ������Ϣ������Լ��۵�
	 * @param messg
	 */
	public abstract void sendMessg(String messg);
	
	/**
	 * ������Ӧ
	 */
	public abstract void reply(String otherMessg);
}
