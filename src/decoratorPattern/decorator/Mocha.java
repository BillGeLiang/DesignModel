package decoratorPattern.decorator;

import decoratorPattern.component.Beverage;

/**
 * �����װ���ߣ�װ�������
 * @author BillGL
 *
 */
public class Mocha extends CondimentDecorator {
	/**
	 * ���뱻װ�εĶ���
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
