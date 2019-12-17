package builderPattern;

import builderPattern.builder.Builder;
import builderPattern.product.Bike;

/**
 * ָ���ߣ�ָ�����幹���ߵ�ִ�й�����˳��/��������,�����ͻ���Ʒ;
 * @author BillGL
 *
 */
public class Director {
	private Builder builder;
	public Director(Builder builder){
		this.builder=builder;
	
	}
	/**
	 * ָ�������߹���,���ؿͻ���Ʒ	
	 * @param builder
	 */
	public Bike construct(){
		builder.buildFrame();
		builder.buildSeat();
		builder.buildTire();
		return builder.createBike();
	}
}
