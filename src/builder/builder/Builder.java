package builder.builder;

import builder.product.Bike;

/**
 * 自行车的建造者接口
 * @author BillGL
 *
 */
public interface Builder {
	public void buildFrame();
	public void buildSeat();
	public void buildTire();
	public Bike createBike();
}
