package decoratorPattern.component;

/**
 * 饮料(原型对象的抽象)
 * @author BillGL
 *
 */
public abstract class Beverage {
	protected String description="unknown Beverage";
	
	public String getDescription(){
		return description;
	}
	
	public abstract double cost();
}
