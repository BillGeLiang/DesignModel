package strategyPattern.strategy_pay;

/**
 * 支付方式
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
	 * 支付信息
	 */
	public abstract void pay();
}
