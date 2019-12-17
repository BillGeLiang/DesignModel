package decoratorPattern.component;


public class HouseBlend extends Beverage {

	
	
	
	public HouseBlend() {
		description="houseBlend";
	}

	@Override
	public double cost() {
		/**
		 * 返回该款饮料的起始价格
		 */
		return 0.89;
	}

}
