package strategyPattern;

/**
 * 银行支付
 * @author BillGL
 *
 */
public class BankPay extends AbsPayment{

	public BankPay(double money) {
		super(money);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void pay() {
		System.out.println("选择银行卡支付------------>");
		System.out.println("支付的金额为："+super.getMoney());
		System.out.println("支付成功--------------->");
	}

}
