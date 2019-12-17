package decoratorPattern.decorator;

import decoratorPattern.component.Beverage;

public class Whip extends CondimentDecorator{

	/**
	 * 引入被装饰的对象
	 */
	private Beverage beverage;
	
	public Whip(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		return beverage.getDescription()+",whip";
	}

	@Override
	public double cost() {
		return beverage.cost()+0.7;
	}

	

}
