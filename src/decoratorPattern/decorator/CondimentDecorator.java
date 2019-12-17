package decoratorPattern.decorator;

import decoratorPattern.component.Beverage;

public abstract class CondimentDecorator extends Beverage {

	/**
	 * 各个具体装饰者必须实现getDescription（）方法
	 */
	public abstract String getDescription();
	
}
