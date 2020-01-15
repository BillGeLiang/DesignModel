package visitorPattern.visitor;

import visitorPattern.element.ElementPerson;

public class OptionOfMarry extends VisitorOption {

	@Override
	public void optionOfMan(ElementPerson person) {
		System.out.println(person.getName()+"说：恋爱游戏终结时，‘有妻徒刑’遥遥无期");
		
	}
 
	@Override
	public void optionOfWoman(ElementPerson person) {
		System.out.println(person.getName()+"说：爱情长跑路漫漫，婚姻保险报平安");
	}

	@Override
	public void choiceOfMan(ElementPerson person) {
	
	}

	@Override
	public void choiceOfWoman(ElementPerson person) {
		
	}

	

}
