package strategyPattern.strategy_pay;

/**
 * ֧����֧��
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
		System.out.println("ѡ��֧����֧��------------>");
		System.out.println("֧���Ľ��Ϊ��" + super.getMoney());
		System.out.println("֧���ɹ�--------------->");

	}

}
