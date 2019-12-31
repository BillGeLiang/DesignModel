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
		 * �����
		 * name:	EuonyMus��˾	description:	ְ���Ǹ���������վ����
			name:	���в���	description:	ְ���Ǹ����
			name:	С��	description:	�����ڿ��в���
			name:	С��	description:	�����ڿ��в���
			name:	��������	description:	ְ���Ǹ㼼��
			name:	С��	description:	�����ڼ�������

		 */
		openPatternTest();
		
		System.out.println("<======================�ֽ���==================================>");
		
		/**
		 * �����
		 * name:	BillGL��˾	description:	ְ����Ѱ���˲�
			name:	��������	description:	����㿪��
			name:	С��	description:	�����ڼ�������
			name:	С��	description:	�����ڼ�������
			name:	������Դ����	description:	������Ƹ
			name:	С��	description:	������������Դ����
			name:	С��	description:	������������Դ����

		 */
		safePatternTest();
	}
	
	/**
	 * ͸��ģʽ
	 */
	public static void openPatternTest(){
		//����һ�����ڵ�
		Corp root=new Branch_("EuonyMus��˾","ְ���Ǹ���������վ����");
		//��Ӳ�ͬ����
		Corp science=new Branch_("���в���","ְ���Ǹ����");
		Corp technology=new Branch_("��������","ְ���Ǹ㼼��");
		root.addSubordinate(science);
		root.addSubordinate(technology);
		
		//�����е���Ա
		Corp xiaoMing=new Clerk_leaf("С��","�����ڿ��в���");
		Corp xiaoFang=new Clerk_leaf("С��","�����ڿ��в���");
		Corp xiaoJun=new Clerk_leaf("С��","�����ڼ�������");
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
	 * ��ȫģʽ
	 * ȱ��:Υ��������ӿڱ��ԭ�򣺣�ʵ���������ӿڻ�����ࣩ
	 */
	public static void safePatternTest(){
		/**
		 * ���ڵ�:��˾
		 */
		Branch root=new Branch("BillGL��˾", "ְ����Ѱ���˲�");
		
		/**
		 * ����һЩ���ţ�ֻ��ͨ��Branchʵ������ܵ���addSubordinate����,�޷�ͨ�����������õ��ã�Υ��������ӿڱ��ԭ��
		 */
		
		Branch tech=new Branch("��������", "����㿪��");
		Branch hr=new Branch("������Դ����", "������Ƹ");
		
		root.addSubordinate(tech);
		root.addSubordinate(hr);
		
		/**
		 * Ա��
		 */
		Clerk_Leaf xiaoTian=new Clerk_Leaf("С��", "������������Դ����");
		Clerk_Leaf xiaoJie=new Clerk_Leaf("С��", "������������Դ����");
		Clerk_Leaf xiaoZhi=new Clerk_Leaf("С��", "�����ڼ�������");
		Clerk_Leaf xiaoKong=new Clerk_Leaf("С��", "�����ڼ�������");
		hr.addSubordinate(xiaoJie);
		hr.addSubordinate(xiaoTian);
		tech.addSubordinate(xiaoKong);
		tech.addSubordinate(xiaoZhi);
		
		safePatternDisplay(root);
	}
	
	public static void safePatternDisplay(Branch corp){
		corp.getInfo();
		for(int i=0;i<corp.getSubordinate().size();i++){
			AbsCorp tem=corp.getSubordinate().get(i);//�ж�Ҷ�ӽڵ�
			if(tem instanceof Clerk_Leaf){
				tem.getInfo();
			}
			else{
				safePatternDisplay((Branch)tem);//ǿ������ת��
			}
		}
	}
}
