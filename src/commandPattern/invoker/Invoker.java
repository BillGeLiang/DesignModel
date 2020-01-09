package commandPattern.invoker;

import java.util.ArrayList;
import java.util.List;

import commandPattern.command.Command;

public class Invoker {
	private List<Command> orderCommList=new ArrayList<>();
	
	/**
	 * 下单
	 * @param command
	 */
	public void setCommand(Command command){
		orderCommList.add(command);
	}
	
	/**
	 * 通知
	 */
	public void notifyComm(){
		for(Command c :orderCommList){
			c.executeComm();
		}
	}
}
