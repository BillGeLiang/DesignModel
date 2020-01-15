package visitorPattern.visitor;

import visitorPattern.element.ElementPerson;

public class OptionOfFailure extends VisitorOption {

	@Override
	public void optionOfMan(ElementPerson person) {
		
		System.out.println(person.getName()+"说：每个成功的男人背后都有一个伟大的女人");
	}

	@Override
	public void optionOfWoman(ElementPerson person) {
		System.out.println(person.getName()+"说：成功的女人背后都有一个失败的男人");
		
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
