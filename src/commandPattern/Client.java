package commandPattern;

import commandPattern.command.BakeMuttonComm;
import commandPattern.command.BakeWingComm;
import commandPattern.command.Command;
import commandPattern.invoker.Invoker;
import commandPattern.receiver.ReceiverCook;

public class Client {
	public static void main(String[] args){
		
		ReceiverCook cook=new ReceiverCook("EuonyMus、");
		Command bakemuttonComm=new BakeMuttonComm(cook);
		Command bakeWingComm=new BakeWingComm(cook);
		Invoker waiter=new Invoker();
		/**
		 * 下订单
		 */
		
		waiter.setCommand(bakemuttonComm);
		waiter.setCommand(bakeWingComm);
		
		/**
		 * 通知后厨执行命令
		 */
		System.out.println("======================>");
		waiter.notifyComm();
	}
}
