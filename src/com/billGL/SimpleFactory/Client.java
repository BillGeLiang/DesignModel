package com.billGL.SimpleFactory;

public class Client {
	public static void main(String[] args) throws Exception {

		Operation add = OperationSimpleFactory.createOperation("+");
		Operation minus = OperationSimpleFactory.createOperation("-");
		Operation multi = OperationSimpleFactory.createOperation("*");
		Operation div = OperationSimpleFactory.createOperation("/");
		System.out.println(add.getResult(1, 2));
		System.out.println(minus.getResult(1, 2));
		System.out.println(multi.getResult(1, 2));
		System.out.println(div.getResult(1, 2));

	}
}
