package builderPattern;

import builderPattern.builder.Builder;
import builderPattern.builder.MobikeBuilder;
import builderPattern.builder.OfOBuilder;
import builderPattern.product.Bike;
import builderPattern.product.BikeV2;

public class Client {
	public static void main(String[] args){
		/**
		 * ���ͽ�����ģʽ[ָ���ߡ������ߡ���Ʒ]
		 */
//		showBike(new OfoBuilder());
//		showBike(new MobikeBuilder());
//		
		
		/**
		 * �Ķ���Ľ�����ģʽv.1[ָ���ߺϲ����������У�ȱ���ǽ�����ְ���ٵ�һ]
		 */
		
		
		
		/**
		 * �Ķ���Ľ�����ģʽv.2[��������Ϊ��Ʒ���ڲ���ʵ�ֲ�Ʒ�ĳ�ʼ��]
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
