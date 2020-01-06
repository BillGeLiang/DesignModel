package strategyPattern;

public class Client {
	public static void main(String[] args){
		AbsPayment weixin=new WeixinPay(34.6);
		AbsPayment ali=new AliPay(45.7);
		AbsPayment bank=new BankPay(22.7);
		/**
		 * ��ʽһ��
		 * �����
		 * ѡ��΢��֧��------------>
			֧���Ľ��Ϊ��34.6
			֧���ɹ�--------------->
			ѡ�����п�֧��------------>
			֧���Ľ��Ϊ��22.7
			֧���ɹ�--------------->
			ѡ��֧����֧��------------>
			֧���Ľ��Ϊ��45.7
			֧���ɹ�--------------->
		 */
		PayContext pc=new PayContext();
		pc.setPay(weixin);
		pc.PayResult();
		pc.setPay(bank);
		pc.PayResult();
		pc.setPay(ali);
		pc.PayResult();
		System.out.println("-----======================================>>>");
		/**
		 * ��ʽ��:
		 * �����
		 * ѡ��֧����֧��------------>
			֧���Ľ��Ϊ��23.7
			֧���ɹ�--------------->
			ѡ��΢��֧��------------>
			֧���Ľ��Ϊ��23.7
			֧���ɹ�--------------->
			ѡ�����п�֧��------------>
			֧���Ľ��Ϊ��23.7
			֧���ɹ�--------------->
		 * 
		 */
		double money=23.7;
		pc.choosePay("ali", money);
		pc.PayResult();
		pc.choosePay("weixin", money);
		pc.PayResult();
		pc.choosePay("bank", money);
		pc.PayResult();
	}
}
