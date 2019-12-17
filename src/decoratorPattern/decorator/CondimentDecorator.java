package decoratorPattern.decorator;

import decoratorPattern.component.Beverage;

public abstract class CondimentDecorator extends Beverage {

	/**
	 * ��������װ���߱���ʵ��getDescription��������
	 */
	public abstract String getDescription();
	
}
