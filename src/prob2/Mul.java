package prob2;

public class Mul extends Arith {
	public Mul(){ }
	
	public Mul(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}

	@Override
	public int calculate() {
		return a*b;
	}

}
