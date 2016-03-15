package prob2;

public class Add extends Arith {

	public Add(){ }
	
	public Add(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}

	@Override
	public int calculate() {
		return a+b;
	}

}
