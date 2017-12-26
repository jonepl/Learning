package learning.dp.prototype;

public class ConcretePrototype implements Prototype {

	private int dataMember1;
	
	public ConcretePrototype(int dm) {
		
		this.dataMember1 = dm;
	}
	public Prototype makeCopy(){
		
		ConcretePrototype cp = null;
		
		try {
			
			cp = (ConcretePrototype)super.clone();
		} catch (CloneNotSupportedException e) {
			
			e.printStackTrace();
		}
		return cp;
	}
	
	public int getDataMember1() {
		
		return this.dataMember1;
	}
}
