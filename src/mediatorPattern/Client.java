package mediatorPattern;

import mediatorPattern.colleague.ColleagueIran;
import mediatorPattern.colleague.ColleagueUS;
import mediatorPattern.mediator.MediatorUN;

public class Client {
	public static void main(String[] args){
		MediatorUN un=new MediatorUN();
		/**
		 * 委托中介者
		 */
		ColleagueUS us=new ColleagueUS(un);
		ColleagueIran iran=new ColleagueIran(un);
		
		/**
		 * 中介者需要认识所有委托自己的对象
		 */
		un.setIran(iran);
		un.setUs(us);
		
		/**
		 * 开始讨论
		 */
		us.sendMessg("我不建议伊朗发展核武器");
		
		System.out.println("议论激烈进行。。。。。");
		
		iran.sendMessg("我偏不！");
		System.out.println("第一轮讨论结束.......");
	}
}
