package learning.generics;

public abstract class Liquid {
	
	protected String name;
	protected String color;
	
	protected String getName() {
		return name;
	}
	protected void setName(String name) {
		this.name = name;
	}
	protected String getColor() {
		return color;
	}
	protected void setColor(String color) {
		this.color = color;
	}
	
	public String toString() {
		
		String result = "Liquid is " + this.name + " which the color of " + this.color;;
		return result;
	}
	
}
