package iteratorPattern.iterator;

import iteratorPattern.aggregate.IProject;

import java.util.ArrayList;
import java.util.Iterator;

public class ProjectIterator implements Iterator{
	//������Ŀ������Arraylist
	private ArrayList<IProject> projectList=new ArrayList<IProject>();
	private int currentItem=0;
	//���캯������projectList
	public ProjectIterator(ArrayList<IProject> projectList){
		this.projectList=projectList;
	}
	
	
	
	@Override
	public boolean hasNext() {
		//����һ������ֵ
		boolean b=true;
		if(this.currentItem>=projectList.size()||this.projectList.get(this.currentItem)==null){
			b=false;
		}
		return b;
	}

	//ȡ����һ��ֵ
	@Override
	public Object next() {
		
		return this.projectList.get(this.currentItem++);
	}

}
