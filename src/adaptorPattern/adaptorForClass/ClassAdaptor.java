package adaptorPattern.adaptorForClass;

public class ClassAdaptor extends ClassAdaptee implements ClassTarget{

	@Override
	public void request() {
		System.out.println("target��������ʵ��........");
		super.adapteeRequest();
	}

}
