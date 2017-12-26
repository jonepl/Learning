package learning.generics;

public class Generics {
	public static void main( String [] args) {
		
		Liquid l1 = new Juice("orange juice","yellow");
		Liquid l2 = new Water("clean water","clear");
		
		Glass g = new Glass<Liquid>();
		
		g.setContents(l1);
		g.printContents();
		g.setContents(l2);
		g.printContents();
	}
}
