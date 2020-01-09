package commandPattern.command;

import commandPattern.receiver.ReceiverCook;

public class BakeWingComm extends Command {

	public BakeWingComm(ReceiverCook receiver) {
		super(receiver);
	}

	@Override
	public void executeComm() {
		System.out.println("֪ͨ��ʦ����������..............");
		receiver.bakeWing();
	}

}
