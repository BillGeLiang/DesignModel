package visitorPattern.visitor;

import visitorPattern.element.ElementPerson;

public class OptionOfLove extends VisitorOption {

	@Override
	public void optionOfMan(ElementPerson person) {
		
		System.out.println(person.getName()+"˵��������ʱ���²���ҲҪװ��");
	}

	@Override
	public void optionOfWoman(ElementPerson person) {
		
		System.out.println(person.getName()+"˵��������ʱ���¶�Ҳװ����");
	}

	@Override
	public void choiceOfMan(ElementPerson person) {
		System.out.println("����person�ṹ��ϵ�һЩ�·���:"+person.getName()+person.getDescription());
		person.choice();
		
	}

	@Override
	public void choiceOfWoman(ElementPerson person) {
		System.out.println("����person�ṹ��ϵ�һЩ�·���:"+person.getName()+person.getDescription());
		person.choice();
		
	}



}
