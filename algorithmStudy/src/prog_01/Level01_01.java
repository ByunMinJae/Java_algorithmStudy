package prog_01;

import java.util.Arrays;
import java.util.Collections;

public class Level01_01 {
	public static void main(String[] args) {
		
		solution("Zbcdefg");
		
	}
	
	
	public static String solution(String s) {
        String[] answer = s.split("");
        Arrays.sort(answer);
        Collections.reverse(Arrays.asList(answer));
        
        return String.join("", answer);
    }
	
}
