package prob2;

public abstract class Arith {
	protected int a;
	protected int b;
	
	public Arith(){ }
	
	public Arith(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}


	public void setValue(int a, int b){
		this.a = a;
		this.b = b;
	}
	
	public abstract int calculate();
	
}
