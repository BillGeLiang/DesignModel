package templatePattern;

import templatePattern.template_exam.AbsExamPaper;
import templatePattern.template_exam.ExamAnsForStd1;
import templatePattern.template_exam.ExamAnsForStd2;

public class Client {
	public static void main(String[] args){
		/**
		 * �Y����
		 *����õ����������˹���........[] a.��ĥ���� 	b.�����	c.���ٺϽ��	d.̼����ά
			��ͬѧѡ����Cѡ��
		     �������Ӣ��½��˫�����˳��黨�������[] a.ʹ��ֲ�ﲻ�ٺ���	b.ʹһ��ֲ�����		c.�ƻ�����̬ƽ��	d.���ɳĮ������
			��ͬѧѡ����Dѡ��
		============================>
		      ����õ����������˹���........[] a.��ĥ���� 	b.�����	c.���ٺϽ��	d.̼����ά
			��ͬѧѡ����Aѡ��
		      �������Ӣ��½��˫�����˳��黨�������[] a.ʹ��ֲ�ﲻ�ٺ���	b.ʹһ��ֲ�����		c.�ƻ�����̬ƽ��	d.���ɳĮ������
			��ͬѧѡ����Aѡ��
		 * 
		 */
		AbsExamPaper stdJia=new ExamAnsForStd1("��ͬѧ");
		stdJia.ansForExam1();
		stdJia.ansForExam2();
		System.out.println("============================>");
		AbsExamPaper stdYi=new ExamAnsForStd2("��ͬѧ");
		stdYi.ansForExam1();
		stdYi.ansForExam2();
	}
}
