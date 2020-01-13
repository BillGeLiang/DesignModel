package statePattern;

import statePattern.context.ContextWork;

public class Client {
	public static void main(String[] args){
		
		ContextWork work=new ContextWork(10);
		work.doWork();
		System.out.println("-------------");
		work.setWorkHour(12);
		work.doWork();
		System.out.println("=============");
		work.setWorkHour(16);
		work.doWork();
		System.out.println("**********");
		work.setWorkHour(18);
		work.doWork();
		System.out.println("^^^^^^^^^^^^^^^^^");
		work.setWorkHour(22);
		work.doWork();
	}
}
