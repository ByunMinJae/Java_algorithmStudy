package bj_step_02_condition;

import java.util.Scanner;

public class S2_01 {
	//두 수 비교하기
	//두 수를 비교한 결과를 출력하는 문제
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		if(A>B) {
			System.out.println(">");
		} else if(A<B) {
			System.out.println("<");
		} else {
			System.out.println("==");
		}
		
	}
}
