package mediatorPattern.colleague;

public abstract class ColleagueCountry {
	
	/**
	 * 发送消息，表达自己观点
	 * @param messg
	 */
	public abstract void sendMessg(String messg);
	
	/**
	 * 作出回应
	 */
	public abstract void reply(String otherMessg);
}
