package learning.dp.decorator;

public class Main {
	public static void main(String [] args ) {
		
		Component c = new ConcreteDecoratorA( new ConcreteDecoratorB( new ConcreteComponent()) );
		
		System.out.println(c.getMethod1());
	}
}
