package strategyPattern;

public class Client {
	public static void main(String[] args){
		AbsPayment weixin=new WeixinPay(34.6);
		AbsPayment ali=new AliPay(45.7);
		AbsPayment bank=new BankPay(22.7);
		/**
		 * 方式一：
		 * 结果：
		 * 选择微信支付------------>
			支付的金额为：34.6
			支付成功--------------->
			选择银行卡支付------------>
			支付的金额为：22.7
			支付成功--------------->
			选择支付宝支付------------>
			支付的金额为：45.7
			支付成功--------------->
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
		 * 方式二:
		 * 结果：
		 * 选择支付宝支付------------>
			支付的金额为：23.7
			支付成功--------------->
			选择微信支付------------>
			支付的金额为：23.7
			支付成功--------------->
			选择银行卡支付------------>
			支付的金额为：23.7
			支付成功--------------->
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
