package strategyPattern.strategy_pay;

/**
 * 微信支付
 * @author BillGL
 *
 */
public class WeixinPay extends AbsPayment{

	public WeixinPay(double money) {
		super(money);
		
	}

	@Override
	public void pay() {
		System.out.println("选择微信支付------------>");
		System.out.println("支付的金额为："+super.getMoney());
		System.out.println("支付成功--------------->");
	}

}
