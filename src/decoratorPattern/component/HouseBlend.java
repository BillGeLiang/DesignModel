package decoratorPattern.component;


public class HouseBlend extends Beverage {

	
	
	
	public HouseBlend() {
		description="houseBlend";
	}

	@Override
	public double cost() {
		/**
		 * ���ظÿ����ϵ���ʼ�۸�
		 */
		return 0.89;
	}

}
