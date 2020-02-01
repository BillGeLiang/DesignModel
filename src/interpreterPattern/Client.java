package interpreterPattern;

import interpreterPattern.calculator.Calculator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Client {
	public static void main(String[] args) throws IOException{
		String expStr=getExpStr();
		//赋值
		HashMap<String,Integer> var=getValue(expStr);
		Calculator cal=new Calculator(expStr);
		/**
		 * 结果：
		 * 请输入表达式：
			a+b-c
			100
			20
			40
			运算结果为：a+b-c=80
		 */
		System.out.println("运算结果为："+expStr+"="+cal.run(var));
	}
	
	
	/**
	 * 获取表达式
	 * @return
	 * @throws IOException
	 */
	public static String getExpStr() throws IOException{
		System.out.println("请输入表达式：");
		return (new BufferedReader(new InputStreamReader(System.in))).readLine();
	}
	
	
	/**
	 * 获取参数与值映射
	 * @param expStr
	 * @return
	 * @throws IOException 
	 */
	private static HashMap<String, Integer> getValue(String expStr) throws IOException {
		HashMap<String,Integer> map=new HashMap<String,Integer>();
		//解析有几个参数要传递
		for(char ch:expStr.toCharArray()){
			if(ch!='+'&&ch!='-'){
				//解决参数重复出现（一个表达式中出现2个以上相同参数）
				if(!map.containsKey(String.valueOf(ch))){
					String in=(new BufferedReader(new InputStreamReader(System.in))).readLine();
					map.put(String.valueOf(ch), Integer.valueOf(in));
				}
			}
		}
		
		return map;
	}
}
