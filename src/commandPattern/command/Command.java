package commandPattern.command;

import commandPattern.receiver.ReceiverCook;

public abstract class Command {
	protected ReceiverCook receiver;

	public Command(ReceiverCook receiver) {
		super();
		this.receiver = receiver;
	}

	/**
	 * 命令指定执行人员
	 * @param receiver
	 */
	public void setReceiver(ReceiverCook receiver) {
		this.receiver = receiver;
	}
	
	/**
	 * 执行命令
	 */
	public abstract void executeComm();
	
	
	
}
