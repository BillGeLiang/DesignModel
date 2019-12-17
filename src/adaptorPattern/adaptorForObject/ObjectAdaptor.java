package adaptorPattern.adaptorForObject;

public class ObjectAdaptor implements ObjectTarget{
	
	ObjectAdaptee ObjectAdaptee;

	public ObjectAdaptor(ObjectAdaptee ObjectAdaptee){
		super();
		this.ObjectAdaptee=ObjectAdaptee;
	}
	
	@Override
	public void request() {
		// TODO Auto-generated method stub
		System.out.println("target�����ľ���ʵ��.................");
		//----------------------------------------------------
		ObjectAdaptee.adapteeRequest();
	}

}
