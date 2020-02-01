package interpreterPattern.calculator;

import interpreterPattern.expression.AddExpression;
import interpreterPattern.expression.Expression;
import interpreterPattern.expression.SubExpression;
import interpreterPattern.expression.VarExpression;

import java.util.HashMap;
import java.util.Stack;

/**
 * 计算器：完成运算的实现逻辑
 * @author BillGL
 *
 */
public class Calculator {
	private Expression exp;
	
	public Calculator(String expStr){
		//定义一个栈，安排运算的先后顺序
		Stack<Expression> stack=new Stack<Expression>();
		//将表达式字符串转化为数组
		char[] charArray=expStr.toCharArray();
		
		//遍历表达式数组，完成运算方式
		Expression left=null;
		Expression right=null;
		
		for(int i=0;i<charArray.length;i++){
			switch (charArray[i]){
			case '+'://如果遇到加法，则将将栈顶元素弹出作为左边元素
				left=stack.pop();
				right=new VarExpression(String.valueOf(charArray[++i]));
				stack.push(new AddExpression(left,right));
				break;
			case '-'://减法类似
				left=stack.pop();
				right=new VarExpression(String.valueOf(charArray[++i]));
				stack.push(new SubExpression(left, right));
				break;
			default://其他作为参数表达式加入栈中
				stack.push(new VarExpression(String.valueOf(charArray[i])));
			}
			
		}
		
		this.exp=stack.pop();
	}
	
	//传入参数与具体值开始运算
	public int run(HashMap<String,Integer> var){
		return this.exp.interpreter(var);
	}
}
