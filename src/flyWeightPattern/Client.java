package flyWeightPattern;

import java.util.ArrayList;
import java.util.List;

public class Client {
	public static void main(String[] args){
		
		/**
		 * 结果：
		 * 这是一只位置在x:4.5	 y:4的white棋子
			这是一只位置在x:4.5	 y:4的white棋子
			这是一只位置在x:3	 y:7的black棋子
			这是一只位置在x:3	 y:7的black棋子
			对象个数为:2
		 */
		test();
		
	}
	
	public static void test(){
		String black="black";
		String white="white";
		//新建一个工厂
		ChessFlyWeightFactory factory=ChessFlyWeightFactory.getFactory();
		List<ChessFlyWeight> list=new ArrayList<>();
		
		//白棋1
		ChessFlyWeight whiteChess1=factory.getChess(white);
		whiteChess1.setLocal("x:3.5\t y:4");
		list.add(whiteChess1);
		//白棋2
		ChessFlyWeight whiteChess2=factory.getChess(white);
		whiteChess2.setLocal("x:4.5\t y:4");
		list.add(whiteChess2);
		//黑棋1
		ChessFlyWeight blackChess1=factory.getChess(black);
		blackChess1.setLocal("x:2\t y:7");
		list.add(blackChess1);
		//黑棋2
		ChessFlyWeight blackChess2=factory.getChess(black);
		blackChess2.setLocal("x:3\t y:7");
		list.add(blackChess2);
		
		for(int i=0;i<list.size();i++){
			list.get(i).chess_state();
		}
		
		//查看池中有多少个对象
		System.out.println("对象个数为:"+factory.getSize());
	}
}
