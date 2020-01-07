package strategyPattern.strategy_pay;

/**
 * ֧����ʽ
 * 
 * @author BillGL
 *
 */
public abstract class AbsPayment {
	private double money;

	public AbsPayment(double money) {
		super();
		this.money = money;
	}

	public double getMoney() {
		return money;
	}

	public void setMoney(double money) {
		this.money = money;
	}

	/**
	 * ֧����Ϣ
	 */
	public abstract void pay();
}
