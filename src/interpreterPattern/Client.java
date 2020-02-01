package interpreterPattern;

import interpreterPattern.calculator.Calculator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Client {
	public static void main(String[] args) throws IOException{
		String expStr=getExpStr();
		//��ֵ
		HashMap<String,Integer> var=getValue(expStr);
		Calculator cal=new Calculator(expStr);
		/**
		 * �����
		 * ��������ʽ��
			a+b-c
			100
			20
			40
			������Ϊ��a+b-c=80
		 */
		System.out.println("������Ϊ��"+expStr+"="+cal.run(var));
	}
	
	
	/**
	 * ��ȡ���ʽ
	 * @return
	 * @throws IOException
	 */
	public static String getExpStr() throws IOException{
		System.out.println("��������ʽ��");
		return (new BufferedReader(new InputStreamReader(System.in))).readLine();
	}
	
	
	/**
	 * ��ȡ������ֵӳ��
	 * @param expStr
	 * @return
	 * @throws IOException 
	 */
	private static HashMap<String, Integer> getValue(String expStr) throws IOException {
		HashMap<String,Integer> map=new HashMap<String,Integer>();
		//�����м�������Ҫ����
		for(char ch:expStr.toCharArray()){
			if(ch!='+'&&ch!='-'){
				//��������ظ����֣�һ�����ʽ�г���2��������ͬ������
				if(!map.containsKey(String.valueOf(ch))){
					String in=(new BufferedReader(new InputStreamReader(System.in))).readLine();
					map.put(String.valueOf(ch), Integer.valueOf(in));
				}
			}
		}
		
		return map;
	}
}
