package strategyPattern.strategy_pay;

/**
 * 支付宝支付
 * 
 * @author BillGL
 *
 */
public class AliPay extends AbsPayment {

	public AliPay(double money) {
		super(money);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void pay() {
		System.out.println("选择支付宝支付------------>");
		System.out.println("支付的金额为：" + super.getMoney());
		System.out.println("支付成功--------------->");

	}

}
