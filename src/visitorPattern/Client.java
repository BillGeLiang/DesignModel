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
		manXiaoMing.setName("С��");
		manXiaoMing.setDescription("Ҫ��������Щ���˶���������Ŀ����Ļ����һ�˵����");
		ElementPerson womanXiaoFang=new Woman();
		womanXiaoFang.setName("С��");
		womanXiaoFang.setDescription("Ҫ��������ЩŮ�˶���������Ŀ����Ļ����һ�˵����");
		ElementStructure eleContain=new ElementStructure();
		eleContain.add(manXiaoMing);
		eleContain.add(womanXiaoFang);
		VisitorOption love=new OptionOfLove();
		VisitorOption failure=new OptionOfFailure();
		VisitorOption marry=new OptionOfMarry();
		//�ι��ߡ�����������
		eleContain.display(love);
		System.out.println("============>");
		//�ι��ߡ���ʧ������
		eleContain.display(failure);
		System.out.println("------------");
		////�ι��ߡ����������
		eleContain.display(marry);
		System.out.println("************");
	}
}
