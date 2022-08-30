package prog_01;


public class Level01_05 {

	public static void main(String[] args) {
		
		solution(123);
		
	}
	
//	풀이 2번
	public static int solution(int n) {
        int answer = 0;
        
        while(true) {
        	
        	answer += n%10; //나눈 나머지(뒤 숫자부터) 더하기
        	
        	if( n<10 ) break; //n이 한 자릿수가 되면 종료
        	
        	n = n/10; //n을 한자리 줄이기(더해준 값 없애기)
        	
        }
        
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println(answer);
        return answer;
    }
	
//	풀이 1번
//    public static int solution(int n) {
//        int answer = 0;
//        
//        String number = String.valueOf(n);
//        
//        String[] arrNum = number.split("");
//        
//        for( int i=0; i<arrNum.length; i++ ) {
//        	
//        	answer += Integer.valueOf(arrNum[i]);
//        	
//        }
//        
//        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
//        System.out.println(answer);
//        return answer;
//    }
	
}
