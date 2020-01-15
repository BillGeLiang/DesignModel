package visitorPattern;

import visitorPattern.element.ElementPerson;
import visitorPattern.element.Man;
import visitorPattern.element.Woman;
import visitorPattern.objectStructure.ElementStructure;
import visitorPattern.visitor.OptionOfFailure;
import visitorPattern.visitor.OptionOfLove;
import visitorPattern.visitor.OptionOfMarry;
import visitorPattern.visitor.VisitorOption;

public class Client {
	public static void main(String[] args){
		ElementPerson manXiaoMing=new Man();
		manXiaoMing.setName("小明");
		manXiaoMing.setDescription("要问我们这些男人对这种问题的看法的话，我会说——");
		ElementPerson womanXiaoFang=new Woman();
		womanXiaoFang.setName("小芳");
		womanXiaoFang.setDescription("要问我们这些女人对这种问题的看法的话，我会说——");
		ElementStructure eleContain=new ElementStructure();
		eleContain.add(manXiaoMing);
		eleContain.add(womanXiaoFang);
		VisitorOption love=new OptionOfLove();
		VisitorOption failure=new OptionOfFailure();
		VisitorOption marry=new OptionOfMarry();
		//参观者——恋爱问题
		eleContain.display(love);
		System.out.println("============>");
		//参观者——失败问题
		eleContain.display(failure);
		System.out.println("------------");
		////参观者——结婚问题
		eleContain.display(marry);
		System.out.println("************");
	}
}
