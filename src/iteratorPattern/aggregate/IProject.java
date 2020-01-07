package iteratorPattern.aggregate;

import iteratorPattern.iterator.ProjectIterator;
/**
 * project容器：用于存储元素
 * @author BillGL
 *
 */
public interface IProject {
	/**
	 * 增加元素
	 * @param name
	 * @param num
	 * @param cost
	 */
	public void add(String name,int num,int cost);
	/**
	 * 获取项目信息
	 * @return
	 */
	public String getProjectInfo();
	
	/**
	 * 获取一个遍历容器的迭代器
	 * @return
	 */
	public ProjectIterator iterator();
}
