package visitorPattern.visitor;

import visitorPattern.element.ElementPerson;
/**
 * 参观者，负责对于被参观者内容的访问，内容的呈现可以自定义
 * @author BillGL
 *
 */
public abstract class VisitorOption {
	public abstract void optionOfMan(ElementPerson person);
	
	public abstract void optionOfWoman(ElementPerson person);
	
	public abstract void choiceOfMan(ElementPerson person);
	
	public abstract void choiceOfWoman(ElementPerson person);
}
