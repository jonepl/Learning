package learning.dp.memento;

import java.util.ArrayList;

public class Caretaker {

	ArrayList<Memento> savedItems = new ArrayList<Memento>();
	
	public void addMemento(Memento m) { savedItems.add(m); }
	
	 public Memento getMemento(int index) { return savedItems.get(index); }
}
