package decoratorPattern.component;


public class Espresso extends Beverage {

	public Espresso(){
		description="Espresso";//具体饮料的描述
	}
	
	@Override
	public double cost() {
		//该款饮料的价格
		return 1.99;
	}

}
