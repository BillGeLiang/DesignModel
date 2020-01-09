package commandPattern.command;

import commandPattern.receiver.ReceiverCook;

public class BakeMuttonComm extends Command {

	public BakeMuttonComm(ReceiverCook receiver) {
		super(receiver);
		
	}

	@Override
	public void executeComm() {
		System.out.println("通知厨师制作烤肉.........");
		receiver.bakeMutton();
		
	}

}
