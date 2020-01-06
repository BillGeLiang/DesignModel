package flyWeightPattern;

/**
 * 具体棋子
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
		System.out.println("这是一只位置在"+super.getLocal()+"的"+super.getColor()+"棋子");
		
	}

}
