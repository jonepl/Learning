package learning.dp.decorator;

public class ConcreteDecoratorA extends Decorator {

	public ConcreteDecoratorA(Component c) {
		
		super(c);
	}
	
	public String getMethod1() {
		
		return c.getMethod1() + ", ConcreteDecoratorA";
	}
	
	public int getMethod2() {
		
		return c.getMethod2() + 1;
	}
}
