package strategyPattern;

import strategyPattern.context.PayContext;
import strategyPattern.strategy_pay.AbsPayment;
import strategyPattern.strategy_pay.AliPay;
import strategyPattern.strategy_pay.BankPay;
import strategyPattern.strategy_pay.WeixinPay;

public class Client {
	public static void main(String[] args){
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
		paymentTest1();
		
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
		paymentTest2();
	}
	
	public static void paymentTest1(){
		AbsPayment weixin=new WeixinPay(34.6);
		AbsPayment ali=new AliPay(45.7);
		AbsPayment bank=new BankPay(22.7);
		PayContext pc=new PayContext();
		pc.setPay(weixin);
		pc.PayResult();
		pc.setPay(bank);
		pc.PayResult();
		pc.setPay(ali);
		pc.PayResult();
	}
	
	public static void paymentTest2(){
		PayContext pc=new PayContext();
		double money=23.7;
		pc.choosePay("ali", money);
		pc.PayResult();
		pc.choosePay("weixin", money);
		pc.PayResult();
		pc.choosePay("bank", money);
		pc.PayResult();
	}
}
