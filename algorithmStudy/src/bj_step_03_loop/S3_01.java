package bj_step_03_loop;

import java.util.Scanner;

public class S3_01 {
	//구구단
	//구구단을 출력하는 문제
	public static void main(String[] args) {
		
		//구구단 n단 입력받기
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i=1; i<=9; i++) {
			System.out.println(n + " * " + i + " = " + n*i);
		}
		
	}
}
