package interpreterPattern.calculator;

import interpreterPattern.expression.AddExpression;
import interpreterPattern.expression.Expression;
import interpreterPattern.expression.SubExpression;
import interpreterPattern.expression.VarExpression;

import java.util.HashMap;
import java.util.Stack;

/**
 * ����������������ʵ���߼�
 * @author BillGL
 *
 */
public class Calculator {
	private Expression exp;
	
	public Calculator(String expStr){
		//����һ��ջ������������Ⱥ�˳��
		Stack<Expression> stack=new Stack<Expression>();
		//�����ʽ�ַ���ת��Ϊ����
		char[] charArray=expStr.toCharArray();
		
		//�������ʽ���飬������㷽ʽ
		Expression left=null;
		Expression right=null;
		
		for(int i=0;i<charArray.length;i++){
			switch (charArray[i]){
			case '+'://��������ӷ����򽫽�ջ��Ԫ�ص�����Ϊ���Ԫ��
				left=stack.pop();
				right=new VarExpression(String.valueOf(charArray[++i]));
				stack.push(new AddExpression(left,right));
				break;
			case '-'://��������
				left=stack.pop();
				right=new VarExpression(String.valueOf(charArray[++i]));
				stack.push(new SubExpression(left, right));
				break;
			default://������Ϊ�������ʽ����ջ��
				stack.push(new VarExpression(String.valueOf(charArray[i])));
			}
			
		}
		
		this.exp=stack.pop();
	}
	
	//������������ֵ��ʼ����
	public int run(HashMap<String,Integer> var){
		return this.exp.interpreter(var);
	}
}
