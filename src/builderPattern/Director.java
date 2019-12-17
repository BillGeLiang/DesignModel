package builderPattern;

import builderPattern.builder.Builder;
import builderPattern.product.Bike;

/**
 * 指挥者：指导具体构建者的执行工作（顺序/部件数）,反馈客户产品;
 * @author BillGL
 *
 */
public class Director {
	private Builder builder;
	public Director(Builder builder){
		this.builder=builder;
	
	}
	/**
	 * 指导建造者工作,返回客户产品	
	 * @param builder
	 */
	public Bike construct(){
		builder.buildFrame();
		builder.buildSeat();
		builder.buildTire();
		return builder.createBike();
	}
}
