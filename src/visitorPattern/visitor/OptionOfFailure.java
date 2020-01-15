package visitorPattern.visitor;

import visitorPattern.element.ElementPerson;

public class OptionOfFailure extends VisitorOption {

	@Override
	public void optionOfMan(ElementPerson person) {
		
		System.out.println(person.getName()+"˵��ÿ���ɹ������˱�����һ��ΰ���Ů��");
	}

	@Override
	public void optionOfWoman(ElementPerson person) {
		System.out.println(person.getName()+"˵���ɹ���Ů�˱�����һ��ʧ�ܵ�����");
		
	}

	@Override
	public void choiceOfMan(ElementPerson person) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void choiceOfWoman(ElementPerson person) {
		// TODO Auto-generated method stub
		
	}



}
