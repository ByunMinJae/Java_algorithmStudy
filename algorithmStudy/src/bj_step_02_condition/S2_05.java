package bj_step_02_condition;

import java.util.Scanner;

public class S2_05 {
	//알람 시계
	//시간 계산 문제
	public static void main(String[] args) {
		
		//두 정수 H, M입력받기
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int M = sc.nextInt();
		
		//찬영이 방법 알람식
		if(H != 0 && M < 45) {
			System.out.println((H-1) + " " + (60-(45-M)));
		} else if(H == 0 && M < 45) {
			System.out.println(((H+24)-1) + " " + (60-(45-M)));
		} else {
			System.out.println(H + " " + (M-45));
		}
		
	}
}
