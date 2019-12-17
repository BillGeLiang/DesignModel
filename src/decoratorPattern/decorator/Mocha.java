package decoratorPattern.decorator;

import decoratorPattern.component.Beverage;

/**
 * 具体的装饰者（装饰组件）
 * @author BillGL
 *
 */
public class Mocha extends CondimentDecorator {
	/**
	 * 引入被装饰的对象
	 */
	private Beverage beverage;
	
	
	public Mocha(Beverage beverage) {
		this.beverage=beverage;
	}

	@Override
	public String getDescription() {
		return beverage.getDescription()+", Mocha";
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return beverage.cost()+0.45;
	}

}
