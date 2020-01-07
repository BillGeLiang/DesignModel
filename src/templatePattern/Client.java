package templatePattern;

import templatePattern.template_exam.AbsExamPaper;
import templatePattern.template_exam.ExamAnsForStd1;
import templatePattern.template_exam.ExamAnsForStd2;

public class Client {
	public static void main(String[] args){
		/**
		 * 結果：
		 *杨过得到，后来给了郭靖........[] a.球磨铸铁 	b.马口铁	c.高速合金钢	d.碳素纤维
			甲同学选择了C选项
		     杨过、程英、陆无双铲除了除情花，造成了[] a.使得植物不再害人	b.使一种植物灭绝		c.破坏了生态平衡	d.造成沙漠化严重
			甲同学选择了D选项
		============================>
		      杨过得到，后来给了郭靖........[] a.球磨铸铁 	b.马口铁	c.高速合金钢	d.碳素纤维
			乙同学选择了A选项
		      杨过、程英、陆无双铲除了除情花，造成了[] a.使得植物不再害人	b.使一种植物灭绝		c.破坏了生态平衡	d.造成沙漠化严重
			乙同学选择了A选项
		 * 
		 */
		AbsExamPaper stdJia=new ExamAnsForStd1("甲同学");
		stdJia.ansForExam1();
		stdJia.ansForExam2();
		System.out.println("============================>");
		AbsExamPaper stdYi=new ExamAnsForStd2("乙同学");
		stdYi.ansForExam1();
		stdYi.ansForExam2();
	}
}
