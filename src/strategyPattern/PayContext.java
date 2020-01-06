package strategyPattern;

/**
 * 支付上下文(支付渠道)
 * 
 * @author BillGL
 *
 */
public class PayContext {
	private AbsPayment pay;

	/**
	 * 选择支付方式
	 * @param type
	 * @param money
	 * @return
	 */
	public AbsPayment choosePay(String type, double money) {
		switch (type) {
		case "weixin":
			pay = new WeixinPay(money);
			break;
		case "ali":
			pay = new AliPay(money);
			break;
		case "bank":
			pay = new BankPay(money);
			break;
		}
		return pay;

	}

	public void PayResult() {
		pay.pay();
	}

	public AbsPayment getPay() {
		return pay;
	}

	public void setPay(AbsPayment pay) {
		this.pay = pay;
	}
	
	
}
