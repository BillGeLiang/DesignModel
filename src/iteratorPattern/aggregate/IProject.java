package iteratorPattern.aggregate;

import iteratorPattern.iterator.ProjectIterator;
/**
 * project���������ڴ洢Ԫ��
 * @author BillGL
 *
 */
public interface IProject {
	/**
	 * ����Ԫ��
	 * @param name
	 * @param num
	 * @param cost
	 */
	public void add(String name,int num,int cost);
	/**
	 * ��ȡ��Ŀ��Ϣ
	 * @return
	 */
	public String getProjectInfo();
	
	/**
	 * ��ȡһ�����������ĵ�����
	 * @return
	 */
	public ProjectIterator iterator();
}
