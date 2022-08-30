package bj_step_02_condition;

import java.util.Scanner;

public class S2_04 {
	//사분면 고르기
	//점이 어느 사분면에 있는지 알아내는 문제
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		final int ZERO = 0;
		
		if(x > ZERO && y > ZERO) {
			System.out.println(1);
		} else if(x < ZERO && y > ZERO) {
			System.out.println(2);
		} else if(x < ZERO && y < ZERO) {
			System.out.println(3);
		} else {
			System.out.println(4);
		}
		
	}
}
