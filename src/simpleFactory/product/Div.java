package simpleFactory.product;


public class Div implements Operation {

	@Override
	public double getResult(double numberA, double numberB) throws Exception {
		// TODO Auto-generated method stub

		if (numberB == 0)
			throw new Exception("��������Ϊ0");
		return numberA / numberB;
	}

}
