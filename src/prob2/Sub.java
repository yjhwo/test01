package prob2;

public class Sub extends Arith {
	public Sub(){ }
	
	public Sub(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}

	@Override
	public int calculate() {
		return a-b;
	}

}
