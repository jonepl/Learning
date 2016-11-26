package learning.dp.decorator;

abstract class Decorator implements Component {
	
	// Reference to Base Class Object
	protected Component c;
	
	public Decorator(Component newC) {
		
		c = newC;
	}
	
	public String getMethod1() {
		
		return c.getMethod1();
	}
	
	public int getMethod2() {
		
		return c.getMethod2();
	}
}