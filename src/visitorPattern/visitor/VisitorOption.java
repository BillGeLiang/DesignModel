package visitorPattern.visitor;

import visitorPattern.element.ElementPerson;
/**
 * �ι��ߣ�������ڱ��ι������ݵķ��ʣ����ݵĳ��ֿ����Զ���
 * @author BillGL
 *
 */
public abstract class VisitorOption {
	public abstract void optionOfMan(ElementPerson person);
	
	public abstract void optionOfWoman(ElementPerson person);
	
	public abstract void choiceOfMan(ElementPerson person);
	
	public abstract void choiceOfWoman(ElementPerson person);
}
