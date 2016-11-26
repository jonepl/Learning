package learning.dp.decorator;

public class ConcreteDecoratorB extends Decorator {

	public ConcreteDecoratorB(Component c) {
		
		super(c);
	}
	
	public String getMethod1() {
		
		return c.getMethod1() + ", ConcreteDecoratorB";
	}
	
	public int getMethod2() {
		
		return c.getMethod2() + 1;
	}
}
