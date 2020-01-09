package commandPattern.receiver;

public class ReceiverCook {
	private String name;
	
	
	
	public ReceiverCook(String name) {
		super();
		this.name = name;
		System.out.println("我是厨师"+name);
	}

	/**
	 * 制作烤肉
	 */
	public void bakeMutton() {

		System.out.println("收到命令，"+name+"正在制作烤肉....");
	}

	/**
	 * 制作烤鸡翅
	 */

	public void bakeWing() {

		System.out.println("收到命令，"+name+"正在制作烤肉....");
	}

}
