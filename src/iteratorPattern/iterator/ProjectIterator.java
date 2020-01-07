package iteratorPattern.iterator;

import iteratorPattern.aggregate.IProject;

import java.util.ArrayList;
import java.util.Iterator;

public class ProjectIterator implements Iterator{
	//所有项目都放在Arraylist
	private ArrayList<IProject> projectList=new ArrayList<IProject>();
	private int currentItem=0;
	//构造函数传入projectList
	public ProjectIterator(ArrayList<IProject> projectList){
		this.projectList=projectList;
	}
	
	
	
	@Override
	public boolean hasNext() {
		//定义一个返回值
		boolean b=true;
		if(this.currentItem>=projectList.size()||this.projectList.get(this.currentItem)==null){
			b=false;
		}
		return b;
	}

	//取得下一个值
	@Override
	public Object next() {
		
		return this.projectList.get(this.currentItem++);
	}

}
