package flyWeightPattern;

import java.util.HashMap;

public class ChessFlyWeightFactory {
	HashMap<String,ChessFlyWeight> map=new HashMap<String,ChessFlyWeight>();
	public static ChessFlyWeightFactory chessFlyWeightFactory;
	
	/**
	 * 双重锁单例模式生成棋子工厂类
	 * @return
	 */
	public static ChessFlyWeightFactory getFactory(){
		synchronized (ChessFlyWeightFactory.class) {
			if (chessFlyWeightFactory == null){
				synchronized (ChessFlyWeightFactory.class) {
					chessFlyWeightFactory = new ChessFlyWeightFactory();
				}
			}
		}
		return chessFlyWeightFactory;
	}
	
	public ChessFlyWeight getChess(String color){
		if(!map.containsKey(color)){
			map.put(color, new ChessFlyWeight(color));
		}
	return map.get(color);

	}
	
	public int getSize(){
		return map.size();
	}

}
