package learning.generics;

public class Glass<T> {
	
	public T contents;

	public T getContents() {
		return contents;
	}

	public void setContents(T contents) {
		this.contents = contents;
	}
	
	public void printContents () {
		
		System.out.println(contents.toString());
	}
}
