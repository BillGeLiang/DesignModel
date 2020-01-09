package commandPattern.invoker;

import java.util.ArrayList;
import java.util.List;

import commandPattern.command.Command;

public class Invoker {
	private List<Command> orderCommList=new ArrayList<>();
	
	/**
	 * �µ�
	 * @param command
	 */
	public void setCommand(Command command){
		orderCommList.add(command);
	}
	
	/**
	 * ֪ͨ
	 */
	public void notifyComm(){
		for(Command c :orderCommList){
			c.executeComm();
		}
	}
}
