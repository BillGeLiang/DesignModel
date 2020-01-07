package iteratorPattern.aggregate;

import iteratorPattern.iterator.ProjectIterator;

import java.util.ArrayList;

public class Project implements IProject {
	// ����һ����Ŀl�б����е���Ŀ����������
	private ArrayList<IProject> projectList = new ArrayList<>();
	// ��Ŀ����
	private String name = "";
	// ��Ŀ��Ա����
	private int num = 0;
	// ��Ŀ����
	private int cost = 0;

	public Project() {

	}

	public Project(String name, int num, int cost) {
		super();
		this.name = name;
		this.num = num;
		this.cost = cost;
	}

	@Override
	public void add(String name, int num, int cost) {
		
		this.projectList.add(new Project(name,num,cost));
	}

	@Override
	public String getProjectInfo() {
		String info="";
		info=info+"��Ŀ����Ϊ:"+this.name;
		//��Ŀ����
		info=info+"��Ŀ����Ϊ��"+this.num;
		//��Ŀ����
		info=info+"��Ŀ����Ϊ��"+this.cost;
		return info;
	}

	//����һ����������
	@Override
	public ProjectIterator iterator() {
		return new ProjectIterator(this.projectList);
	}

}
