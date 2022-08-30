package prog_01;

//1부터 입력받은 숫자 n 사이에 있는 소수의 개수를 반환하는 함수, solution을 만들어 보세요.

public class Level01_04 {
	
	public static void main(String[] args) {
		
		solution(10);
		
	}
	
	public static int solution(int n) {
		int answer = 0;
		
		for( int i=2; i<=n; i++ ) {
			boolean isPrimeNum = true;
			
			for ( int j=2; j<i; j++ ) {
				
				if( i%j == 0 ) {
					isPrimeNum = false;
					break;
				}
				
			}
			
			if( isPrimeNum ) {
				answer++;
			}
			
		}
		
		
        System.out.println(answer);
        return answer;
    }
	
//	public static int solution(int n) {
//		int answer = 0;
//		
//		for(int i=2; i<=n; i++) {
//			boolean flag = true;
//			
//			for(int j=2; j<i; j++) {
//				
//				if(i%j == 0) {
//					flag = false;
//					break;
//				}
//				
//			}
//			
//			if(flag) answer++;
//			
//		}
//		
//		System.out.println(answer);
//		return answer;
//	}
	
}
