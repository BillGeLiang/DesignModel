package decoratorPattern.component;


public class Espresso extends Beverage {

	public Espresso(){
		description="Espresso";//�������ϵ�����
	}
	
	@Override
	public double cost() {
		//�ÿ����ϵļ۸�
		return 1.99;
	}

}
