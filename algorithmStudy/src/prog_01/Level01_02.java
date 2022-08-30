package prog_01;

import java.util.Arrays;

public class Level01_02 {

	
		
		public static void main(String[] args) {
			
			solution(2,5);
			
		}
		
	    public static int[] solution(int n, int m) {
	        int[] answer = new int[2];
	        
	        //최대공약수
	        if(n < m) {
	        	for(int i=n; i<=n; i--) {
	        		if(n%i == 0 && m%i == 0) {
	        			answer[0] += i;
	        			break;
	        		}
	        	} 
	        } else {
	        	for(int i=m; i<=m; i--) {
	        		if(n%i == 0 && m%i == 0) {
	        			answer[0] += i;
	        			break;
	        		}
	        	}
	        }
	        
	        //최소공배수
	        if(n > m) {
	        	for(int i=n; i>=n; i++) {
	        		if(i%n == 0 && i%m == 0) {
	        			answer[1] += i;
	        			break;
	        		}
	        	} 
	        } else {
	        	for(int i=m; i>=m; i++) {
	        		if(i%n == 0 && i%m == 0) {
	        			answer[1] += i;
	        			break;
	        		}
	        	}
	        }
	        System.out.println(Arrays.toString(answer));
	        return answer;
	    }
	   
	
}
