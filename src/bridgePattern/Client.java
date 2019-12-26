package bridgePattern;

import bridgePattern.abstraction.Rectangle;
import bridgePattern.abstraction.Shape;
import bridgePattern.abstraction.Square;
import bridgePattern.abstraction.Triangle;
import bridgePattern.implementor.BlackColor;
import bridgePattern.implementor.Color;
import bridgePattern.implementor.RedColor;
import bridgePattern.implementor.WhiteColor;

public class Client {
	public static void main(String[] args){
		
		/**
		 * 结果：
		 * 红色的triangle
			黑色的Rectangle
			白色的Square

		 */
		Color red=new RedColor();
		Color white=new WhiteColor();
		Color black=new BlackColor();
		Shape triangle=new Triangle();
		Shape rectangle=new Rectangle();
		Shape square=new Square();
		triangle.setColor(red);
		triangle.draw();
		rectangle.setColor(black);
		rectangle.draw();
		square.setColor(white);
		square.draw();
	}
}
