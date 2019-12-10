package simpleFactory.factory;

import simpleFactory.product.Add;
import simpleFactory.product.Div;
import simpleFactory.product.Minus;
import simpleFactory.product.Multi;
import simpleFactory.product.Operation;

public class OperationSimpleFactory {
	private static Operation operationObject = null;

	public static Operation createOperation(String type) {

		switch (type) {
		case "/":
			operationObject = createDiv();
//			operationObject=new Div();
			break;
		case "*":
			operationObject = createMulti();
//			operationObject=new Multi();
			break;
		case "-":
			operationObject = createMinus();
//			operationObject=new Minus();
			break;
		case "+":
			operationObject = createAdd();
//			operationObject=new Add();
		}
		return operationObject;
	}

	private static Operation createAdd() {
		return new Add();
	}

	private static Operation createMinus() {
		return new Minus();
	}

	private static Operation createMulti() {
		return new Multi();

	}

	private static Operation createDiv() {
		return new Div();
	}
}
