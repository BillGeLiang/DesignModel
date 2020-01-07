package iteratorPattern;

import iteratorPattern.aggregate.IProject;
import iteratorPattern.aggregate.Project;
import iteratorPattern.iterator.ProjectIterator;

public class Client {
	public static void main(String[] args){
		
		/**
		 * �����
		 * ��Ŀ����Ϊ:�����ս��Ŀ����Ϊ��10��Ŀ����Ϊ��10000
			��Ŀ����Ϊ:Ťתʱ����Ŀ��Ŀ����Ϊ��20��Ŀ����Ϊ��2000
			��Ŀ����Ϊ:��3����Ŀ��Ŀ����Ϊ��23��Ŀ����Ϊ��60000
			��Ŀ����Ϊ:��4����Ŀ��Ŀ����Ϊ��24��Ŀ����Ϊ��80000
			��Ŀ����Ϊ:��5����Ŀ��Ŀ����Ϊ��25��Ŀ����Ϊ��100000
			��Ŀ����Ϊ:��6����Ŀ��Ŀ����Ϊ��26��Ŀ����Ϊ��120000
			��Ŀ����Ϊ:��7����Ŀ��Ŀ����Ϊ��27��Ŀ����Ϊ��140000
			��Ŀ����Ϊ:��8����Ŀ��Ŀ����Ϊ��28��Ŀ����Ϊ��160000
			��Ŀ����Ϊ:��9����Ŀ��Ŀ����Ϊ��29��Ŀ����Ϊ��180000
			��Ŀ����Ϊ:��10����Ŀ��Ŀ����Ϊ��30��Ŀ����Ϊ��200000
		 */
		IProject project =new Project();
		project.add("�����ս",10,10000);
		project.add("Ťתʱ����Ŀ",20,2000);
		for(int i=3;i<=10;i++){
			project.add("��"+i+"����Ŀ",20+i,+20000*i);
		}
		//������Ŀ
		ProjectIterator projectIterator=project.iterator();
		while(projectIterator.hasNext()){
			IProject p=(IProject) projectIterator.next();
			System.out.println(p.getProjectInfo());
		}
	}
}
