package builderPattern;

import builderPattern.builder.Builder;
import builderPattern.builder.MobikeBuilder;
import builderPattern.builder.OfOBuilder;
import builderPattern.product.Bike;
import builderPattern.product.BikeV2;

public class Client {
	public static void main(String[] args){
		/**
		 * 典型建造者模式[指导者、建造者、产品]
		 */
//		showBike(new OfoBuilder());
//		showBike(new MobikeBuilder());
//		
		
		/**
		 * 改动后的建造者模式v.1[指导者合并到建造者中，缺点是建造者职责不再单一]
		 */
		
		
		
		/**
		 * 改动后的建造者模式v.2[建造者作为产品的内部类实现产品的初始化]
		 */
		BikeV2 ofobike=new BikeV2.BikeBuilder().frame("Ofo Frame").tire("Ofo tire").seat("ofo seat").build();
		System.out.println(ofobike);
	}
	
//	public static void showBike(Builder builder){
//		Director director=new Director(builder);
//		Bike bike=director.construct();
//		System.out.println(bike);
//	}
}
