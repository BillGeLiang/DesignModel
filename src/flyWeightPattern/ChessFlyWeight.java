package flyWeightPattern;

/**
 * ��������
 * @author BillGL
 *
 */
public class ChessFlyWeight extends ChessAbsFlyWeight{

	public ChessFlyWeight(String color) {
		super(color);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void chess_state() {
		System.out.println("����һֻλ����"+super.getLocal()+"��"+super.getColor()+"����");
		
	}

}
