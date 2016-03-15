package prob2;

public class Div extends Arith {
	public Div(){ }
	
	public Div(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}
	@Override
	public int calculate() {
		return a/b;
	}

}
