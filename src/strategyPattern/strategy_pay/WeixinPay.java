package strategyPattern.strategy_pay;

/**
 * ΢��֧��
 * @author BillGL
 *
 */
public class WeixinPay extends AbsPayment{

	public WeixinPay(double money) {
		super(money);
		
	}

	@Override
	public void pay() {
		System.out.println("ѡ��΢��֧��------------>");
		System.out.println("֧���Ľ��Ϊ��"+super.getMoney());
		System.out.println("֧���ɹ�--------------->");
	}

}
