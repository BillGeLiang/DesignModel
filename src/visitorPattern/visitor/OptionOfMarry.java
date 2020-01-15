package visitorPattern.visitor;

import visitorPattern.element.ElementPerson;

public class OptionOfMarry extends VisitorOption {

	@Override
	public void optionOfMan(ElementPerson person) {
		System.out.println(person.getName()+"˵��������Ϸ�ս�ʱ��������ͽ�̡�ңң����");
		
	}
 
	@Override
	public void optionOfWoman(ElementPerson person) {
		System.out.println(person.getName()+"˵�����鳤��·�������������ձ�ƽ��");
	}

	@Override
	public void choiceOfMan(ElementPerson person) {
	
	}

	@Override
	public void choiceOfWoman(ElementPerson person) {
		
	}

	

}
