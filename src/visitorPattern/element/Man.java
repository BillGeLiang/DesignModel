package visitorPattern.element;

import visitorPattern.visitor.OptionOfLove;
import visitorPattern.visitor.VisitorOption;
/**
 * ÄÐÈË
 * @author BillGL
 *
 */
public class Man extends ElementPerson {

	@Override
	public void accept(VisitorOption visitor) {
		visitor.optionOfMan(this);
		if(visitor instanceof OptionOfLove)
		visitor.choiceOfMan(this);
	}

}
