package learning.dp.memento;

public class Player implements Memento {

	private String name;
	private double hp;
	private String specialPhrase;
	
	//Constructor
	public Player(String playerName, int playerHP, String playerPhrase) { 
		
		this.name = playerName; 
		this.hp  = playerHP;
		this.specialPhrase = playerPhrase;
	}
	//========== Acessors and Mutators ================//

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
