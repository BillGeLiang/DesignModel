package visitorPattern.element;

import visitorPattern.visitor.OptionOfLove;
import visitorPattern.visitor.VisitorOption;

/**
 * ≈Æ»À
 * @author BillGL
 *
 */
public class Woman extends ElementPerson {

	@Override
	public void accept(VisitorOption visitor) {
		visitor.optionOfWoman(this);
		if(visitor instanceof OptionOfLove)
			visitor.choiceOfWoman(this);
	}

}
