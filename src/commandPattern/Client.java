package commandPattern;

import commandPattern.command.BakeMuttonComm;
import commandPattern.command.BakeWingComm;
import commandPattern.command.Command;
import commandPattern.invoker.Invoker;
import commandPattern.receiver.ReceiverCook;

public class Client {
	public static void main(String[] args){
		
		ReceiverCook cook=new ReceiverCook("EuonyMus��");
		Command bakemuttonComm=new BakeMuttonComm(cook);
		Command bakeWingComm=new BakeWingComm(cook);
		Invoker waiter=new Invoker();
		/**
		 * �¶���
		 */
		
		waiter.setCommand(bakemuttonComm);
		waiter.setCommand(bakeWingComm);
		
		/**
		 * ֪ͨ���ִ������
		 */
		System.out.println("======================>");
		waiter.notifyComm();
	}
}
