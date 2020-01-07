package iteratorPattern;

import iteratorPattern.aggregate.IProject;
import iteratorPattern.aggregate.Project;
import iteratorPattern.iterator.ProjectIterator;

public class Client {
	public static void main(String[] args){
		
		/**
		 * 结果：
		 * 项目名称为:星球大战项目人数为：10项目花费为：10000
			项目名称为:扭转时空项目项目人数为：20项目花费为：2000
			项目名称为:第3个项目项目人数为：23项目花费为：60000
			项目名称为:第4个项目项目人数为：24项目花费为：80000
			项目名称为:第5个项目项目人数为：25项目花费为：100000
			项目名称为:第6个项目项目人数为：26项目花费为：120000
			项目名称为:第7个项目项目人数为：27项目花费为：140000
			项目名称为:第8个项目项目人数为：28项目花费为：160000
			项目名称为:第9个项目项目人数为：29项目花费为：180000
			项目名称为:第10个项目项目人数为：30项目花费为：200000
		 */
		IProject project =new Project();
		project.add("星球大战",10,10000);
		project.add("扭转时空项目",20,2000);
		for(int i=3;i<=10;i++){
			project.add("第"+i+"个项目",20+i,+20000*i);
		}
		//遍历项目
		ProjectIterator projectIterator=project.iterator();
		while(projectIterator.hasNext()){
			IProject p=(IProject) projectIterator.next();
			System.out.println(p.getProjectInfo());
		}
	}
}
