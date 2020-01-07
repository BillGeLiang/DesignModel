package iteratorPattern.aggregate;

import iteratorPattern.iterator.ProjectIterator;

import java.util.ArrayList;

public class Project implements IProject {
	// 定义一个项目l列表，所有的项目都放在这里
	private ArrayList<IProject> projectList = new ArrayList<>();
	// 项目名称
	private String name = "";
	// 项目成员变量
	private int num = 0;
	// 项目花费
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
		info=info+"项目名称为:"+this.name;
		//项目人数
		info=info+"项目人数为："+this.num;
		//项目花费
		info=info+"项目花费为："+this.cost;
		return info;
	}

	//产生一个遍历对象
	@Override
	public ProjectIterator iterator() {
		return new ProjectIterator(this.projectList);
	}

}
