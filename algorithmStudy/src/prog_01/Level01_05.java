package prog_01;


public class Level01_05 {

	public static void main(String[] args) {
		
		solution(123);
		
	}
	
//	Ǯ�� 2��
	public static int solution(int n) {
        int answer = 0;
        
        while(true) {
        	
        	answer += n%10; //���� ������(�� ���ں���) ���ϱ�
        	
        	if( n<10 ) break; //n�� �� �ڸ����� �Ǹ� ����
        	
        	n = n/10; //n�� ���ڸ� ���̱�(������ �� ���ֱ�)
        	
        }
        
        // [����] ��ư�� ������ ��� ���� �� �� �ֽ��ϴ�.
        System.out.println(answer);
        return answer;
    }
	
//	Ǯ�� 1��
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
//        // [����] ��ư�� ������ ��� ���� �� �� �ֽ��ϴ�.
//        System.out.println(answer);
//        return answer;
//    }
	
}
