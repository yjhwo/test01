package prob5;

public class MyStack implements Stack{
	private String[] buffer;
	private int capacity;
	private int top;
	
	public MyStack(int capacity){
		this.capacity = capacity;
		top = 0;
		
		buffer = new String[capacity];	// 처음에 생성
	}
	
	public void resizeBuffer(){
		capacity *= 2;	// 방 크기 *2만큼 증가
		String[] tmp = new String[capacity];
		
		// tmp 배열에 옮겨 놓고 다시 버퍼에 덮어쓰기
		for(int i=0; i<buffer.length; i++){
			tmp[i] = buffer[i];
		}
		
		buffer = tmp;
	}
	
	@Override
	public void push(String str) {
		buffer[top++] = str;

		if(top == capacity){
			resizeBuffer();
		}
	}

	@Override
	public String pop() {
		if(--top < 0){
			return null;
		}
		
		return buffer[top];
	}

	@Override
	public boolean isEmpty() {
		return top==0;
	}

	@Override
	public int size() {
		return top;
	}

}
