package strategyPattern;

/**
 * ����֧��
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
		System.out.println("ѡ�����п�֧��------------>");
		System.out.println("֧���Ľ��Ϊ��"+super.getMoney());
		System.out.println("֧���ɹ�--------------->");
	}

}
