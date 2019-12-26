package bridgePattern.abstraction;

import bridgePattern.implementor.Color;

public abstract class Shape {
	protected Color color;
	
	public void setColor(Color color){
		this.color=color;
	}
	
	public abstract void draw();
}
