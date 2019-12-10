package builder.builder;

import builder.product.Bike;

public class OfOBuilder implements Builder{
	private Bike bike=new Bike();
	
	@Override
	public void buildFrame() {
		bike.setFrame("OFO Frame");
		
	}

	@Override
	public void buildSeat() {
		// TODO Auto-generated method stub
		bike.setSeat("OFO Seat");
		
	}

	@Override
	public void buildTire() {
		// TODO Auto-generated method stub
		bike.setTire("OFO tire");
		
	}

	@Override
	public Bike createBike() {
		// TODO Auto-generated method stub
		return bike;
	}

}
