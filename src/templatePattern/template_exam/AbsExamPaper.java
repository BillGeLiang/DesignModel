package templatePattern.template_exam;

public abstract class AbsExamPaper {
	/**
	 * ����1
	 */
	public void examination1(){
		System.out.println("����õ����������˹���........[] a.��ĥ���� 	"
				+ "b.�����	c.���ٺϽ��	d.̼����ά");
	}
	
	/**
	 * ����2
	 */
	public void examination2(){
		System.out.println("�������Ӣ��½��˫�����˳��黨�������[] a.ʹ��ֲ�ﲻ�ٺ���	b.ʹһ��ֲ�����		"
				+ "c.�ƻ�����̬ƽ��	d.���ɳĮ������");
	}
	
	/**
	 * ����1�Ĵ𰸣����裩
	 */
	public abstract void ansForExam1();
	
	/**
	 * ����2�Ĵ𰸣����裩
	 */
	public abstract void ansForExam2();
}
