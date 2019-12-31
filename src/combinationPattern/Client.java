package combinationPattern;

import combinationPattern.openPattern.Branch_;
import combinationPattern.openPattern.Clerk_leaf;
import combinationPattern.openPattern.Corp;
import combinationPattern.safePattern.AbsCorp;
import combinationPattern.safePattern.Branch;
import combinationPattern.safePattern.Clerk_Leaf;

public class Client {
	public static void main(String[] args){
		/**
		 * 结果：
		 * name:	EuonyMus公司	description:	职责是负责互联网网站开发
			name:	科研部门	description:	职责是搞科研
			name:	小明	description:	工作在科研部门
			name:	小芳	description:	工作在科研部门
			name:	技术部门	description:	职责是搞技术
			name:	小军	description:	工作在技术部门

		 */
		openPatternTest();
		
		System.out.println("<======================分界线==================================>");
		
		/**
		 * 结果：
		 * name:	BillGL公司	description:	职责是寻找人才
			name:	技术部门	description:	负责搞开发
			name:	小空	description:	工作在技术部门
			name:	小智	description:	工作在技术部门
			name:	人力资源部门	description:	负责招聘
			name:	小结	description:	工作在人力资源部门
			name:	小天	description:	工作在人力资源部门

		 */
		safePatternTest();
	}
	
	/**
	 * 透明模式
	 */
	public static void openPatternTest(){
		//创建一个根节点
		Corp root=new Branch_("EuonyMus公司","职责是负责互联网网站开发");
		//添加不同部门
		Corp science=new Branch_("科研部门","职责是搞科研");
		Corp technology=new Branch_("技术部门","职责是搞技术");
		root.addSubordinate(science);
		root.addSubordinate(technology);
		
		//部门中的人员
		Corp xiaoMing=new Clerk_leaf("小明","工作在科研部门");
		Corp xiaoFang=new Clerk_leaf("小芳","工作在科研部门");
		Corp xiaoJun=new Clerk_leaf("小军","工作在技术部门");
		science.addSubordinate(xiaoMing);
		science.addSubordinate(xiaoFang);
		technology.addSubordinate(xiaoJun);
		openPatternDisplay(root);
		
	}
	
	public static void openPatternDisplay(Corp corp){
		if(!(corp instanceof Clerk_leaf)){
			corp.getInfo();
		}
		for(int i=0;i<corp.getSubordinate().size();i++){
			Corp tem=corp.getSubordinate().get(i);
			if(tem instanceof Clerk_leaf){
				tem.getInfo();
			}
			else{
				openPatternDisplay(tem);
			}
		}
	}
	
	
	
	/**
	 * 安全模式
	 * 缺点:违反了面向接口编程原则：（实现类依赖接口或抽象类）
	 */
	public static void safePatternTest(){
		/**
		 * 根节点:公司
		 */
		Branch root=new Branch("BillGL公司", "职责是寻找人才");
		
		/**
		 * 新增一些部门：只能通过Branch实现类才能调用addSubordinate方法,无法通过抽象类引用调用，违反了面向接口编程原则
		 */
		
		Branch tech=new Branch("技术部门", "负责搞开发");
		Branch hr=new Branch("人力资源部门", "负责招聘");
		
		root.addSubordinate(tech);
		root.addSubordinate(hr);
		
		/**
		 * 员工
		 */
		Clerk_Leaf xiaoTian=new Clerk_Leaf("小天", "工作在人力资源部门");
		Clerk_Leaf xiaoJie=new Clerk_Leaf("小结", "工作在人力资源部门");
		Clerk_Leaf xiaoZhi=new Clerk_Leaf("小智", "工作在技术部门");
		Clerk_Leaf xiaoKong=new Clerk_Leaf("小空", "工作在技术部门");
		hr.addSubordinate(xiaoJie);
		hr.addSubordinate(xiaoTian);
		tech.addSubordinate(xiaoKong);
		tech.addSubordinate(xiaoZhi);
		
		safePatternDisplay(root);
	}
	
	public static void safePatternDisplay(Branch corp){
		corp.getInfo();
		for(int i=0;i<corp.getSubordinate().size();i++){
			AbsCorp tem=corp.getSubordinate().get(i);//判断叶子节点
			if(tem instanceof Clerk_Leaf){
				tem.getInfo();
			}
			else{
				safePatternDisplay((Branch)tem);//强制类型转换
			}
		}
	}
}
