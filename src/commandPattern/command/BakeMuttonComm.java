package commandPattern.command;

import commandPattern.receiver.ReceiverCook;

public class BakeMuttonComm extends Command {

	public BakeMuttonComm(ReceiverCook receiver) {
		super(receiver);
		
	}

	@Override
	public void executeComm() {
		System.out.println("֪ͨ��ʦ��������.........");
		receiver.bakeMutton();
		
	}

}
