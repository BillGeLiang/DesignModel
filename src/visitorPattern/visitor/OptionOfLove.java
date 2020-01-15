package visitorPattern.visitor;

import visitorPattern.element.ElementPerson;

public class OptionOfLove extends VisitorOption {

	@Override
	public void optionOfMan(ElementPerson person) {
		
		System.out.println(person.getName()+"说：在恋爱时凡事不懂也要装懂");
	}

	@Override
	public void optionOfWoman(ElementPerson person) {
		
		System.out.println(person.getName()+"说：在恋爱时遇事懂也装不懂");
	}

	@Override
	public void choiceOfMan(ElementPerson person) {
		System.out.println("根据person结构组合的一些新方法:"+person.getName()+person.getDescription());
		person.choice();
		
	}

	@Override
	public void choiceOfWoman(ElementPerson person) {
		System.out.println("根据person结构组合的一些新方法:"+person.getName()+person.getDescription());
		person.choice();
		
	}



}
