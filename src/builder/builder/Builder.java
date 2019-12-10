package builder.builder;

import builder.product.Bike;

/**
 * ���г��Ľ����߽ӿ�
 * @author BillGL
 *
 */
public interface Builder {
	public void buildFrame();
	public void buildSeat();
	public void buildTire();
	public Bike createBike();
}
