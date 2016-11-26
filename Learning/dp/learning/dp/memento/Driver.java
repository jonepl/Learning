package learning.dp.memento;

public class Driver {
	public static void main (String [] args) {
		
		Orginator o1 = new Orginator(); 
		
		o1.setName("Purnell Jones");
		o1.setHp(1016.1987);
		o1.setSpecialPhrase("Naw Bruh!");
		
		o1.speak();
		Memento m1 = o1.makeMemento();
		
		o1.setName("Spencer hasNoLaptop");
		o1.setHp(1.9);
		o1.setSpecialPhrase("Fuck you");
		
		o1.speak();
		o1.restoreFromMemento(m1);
		
		o1.speak();
	}
}
