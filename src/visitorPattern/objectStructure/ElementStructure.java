package visitorPattern.objectStructure;

import java.util.ArrayList;
import java.util.List;

import visitorPattern.element.ElementPerson;
import visitorPattern.visitor.VisitorOption;

public class ElementStructure {
	List<ElementPerson> list=new ArrayList<ElementPerson>();
	public void add(ElementPerson ele){
		list.add(ele);
	}
	
	public void remove(ElementPerson ele){
		list.remove(ele);
	}
	
	public void display(VisitorOption visitor){
		for(ElementPerson e:list){
			e.accept(visitor);
		}
	}
}
