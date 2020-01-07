package templatePattern.template_exam;

public abstract class AbsExamPaper {
	/**
	 * 试题1
	 */
	public void examination1(){
		System.out.println("杨过得到，后来给了郭靖........[] a.球磨铸铁 	"
				+ "b.马口铁	c.高速合金钢	d.碳素纤维");
	}
	
	/**
	 * 试题2
	 */
	public void examination2(){
		System.out.println("杨过、程英、陆无双铲除了除情花，造成了[] a.使得植物不再害人	b.使一种植物灭绝		"
				+ "c.破坏了生态平衡	d.造成沙漠化严重");
	}
	
	/**
	 * 试题1的答案（步骤）
	 */
	public abstract void ansForExam1();
	
	/**
	 * 试题2的答案（步骤）
	 */
	public abstract void ansForExam2();
}
