package learning.dp.memento;

public class Orginator {

	private String name;
	private double hp;
	private String specialPhrase;
	
	private class PlayerMemento implements Memento {
		
		private String nameCopy;
		private double hpCopy;
		private String specialPhraseCopy;
		
		//Constructor
		public PlayerMemento() { 
		
			
			nameCopy = name;
			hpCopy = hp;
			specialPhraseCopy = specialPhrase;
			
		}
		
		void restore(Orginator o) {
			
			if( o != Orginator.this ) { 
				throw new RuntimeException("Damn Bruh.");
			}
			o.name = nameCopy;
			o.hp = hpCopy;
			o.specialPhrase = specialPhraseCopy;
			
		}
	}; // End PlayerMemento
	
	
	public Memento makeMemento() {
		
		//System.out.println("Inside Orginator::storeInMemento()");
		return new PlayerMemento();
	}
	
	public void restoreFromMemento(Memento m) {
		
		((PlayerMemento)m).restore(this);
	}
	
	public void speak() {
		
		System.out.println("My name is " + name + 
				". I have " + hp + " hp. " + specialPhrase );
	}
	
	//=======================================//
	//			Accessor and Mutators
	//=======================================//

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getHp() {
		return hp;
	}

	public void setHp(double hp) {
		this.hp = hp;
	}

	public String getSpecialPhrase() {
		return specialPhrase;
	}

	public void setSpecialPhrase(String specialPhrase) {
		this.specialPhrase = specialPhrase;
	}	
}
