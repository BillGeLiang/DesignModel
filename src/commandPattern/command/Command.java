package commandPattern.command;

import commandPattern.receiver.ReceiverCook;

public abstract class Command {
	protected ReceiverCook receiver;

	public Command(ReceiverCook receiver) {
		super();
		this.receiver = receiver;
	}

	/**
	 * ����ָ��ִ����Ա
	 * @param receiver
	 */
	public void setReceiver(ReceiverCook receiver) {
		this.receiver = receiver;
	}
	
	/**
	 * ִ������
	 */
	public abstract void executeComm();
	
	
	
}
