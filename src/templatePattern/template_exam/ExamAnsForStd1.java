package templatePattern.template_exam;

public class ExamAnsForStd1 extends AbsExamPaper {
	private String name;
	
	
	
	public ExamAnsForStd1(String name) {
		super();
		this.name = name;
	}

	@Override
	public void ansForExam1() {
		// TODO Auto-generated method stub
		super.examination1();
		System.out.println(name+"ѡ����Cѡ��");
	}

	@Override
	public void ansForExam2() {
		// TODO Auto-generated method stub
		super.examination2();
		System.out.println(name+"ѡ����Dѡ��");
	}

}
