package prob1;

public class Game369 {
	public static void main(String[] args) {
		
		// 1~99
		for(int i=1; i<100; i++){
			int chk = 0;	
			int m = i/10;	// 10의 자리수
			int n = i%10;	// 1의 자리수
			
			if(m==0){
			}else if(m%3==0 || m%6==0 || m%9==0){
				chk++;
			}
			
			
			if(n==0){
			}else if(n%3==0 || n%6==0 || n%9==0){
				chk++;
			}
			
			// 출력
			if (chk > 0) {
				System.out.print(i + " ");
				
				for (int j = 0; j < chk; j++) {
					System.out.print("짝");
				}
				System.out.println();
			}
		}
		
	}
}
