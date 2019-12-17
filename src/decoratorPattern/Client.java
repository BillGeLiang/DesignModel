package decoratorPattern;

import decoratorPattern.component.Beverage;
import decoratorPattern.component.Espresso;
import decoratorPattern.component.HouseBlend;
import decoratorPattern.decorator.Mocha;
import decoratorPattern.decorator.Whip;

public class Client {
	public static void main(String[] args){
		Beverage beverage=new Espresso();
		System.out.println(beverage.getDescription()+"  \n$"+beverage.cost());
		
		Beverage beverage2=new HouseBlend();
		beverage2=new Mocha(beverage2);
		beverage2=new Mocha(beverage2);
		beverage2=new Whip(beverage2);
		
		System.out.println(beverage2.getDescription()+"  \n$"+beverage2.cost());
	}
}
