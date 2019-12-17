package builderPattern.builder;

import builderPattern.product.Bike;

public class MobikeBuilder implements Builder{
	private Bike bike=new Bike();
	
	@Override
	public void buildFrame() {
		// TODO Auto-generated method stub
		bike.setFrame("Mobike Frame");
		
	}

	@Override
	public void buildSeat() {
		// TODO Auto-generated method stub
		bike.setSeat("Mobike Seat");
	}

	@Override
	public void buildTire() {
		// TODO Auto-generated method stub
		bike.setTire("Mobike tire");
		
	}

	@Override
	public Bike createBike() {
		// TODO Auto-generated method stub
		return bike;
	}

}
