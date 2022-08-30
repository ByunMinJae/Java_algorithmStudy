package bj_step_02_condition;

import java.util.Scanner;

public class S2_03 {
	//윤년
	//윤년을 판별하는 문제
	public static void main(String[] args) {
		
		//년도 입력받기
		Scanner sc = new Scanner(System.in);
		
		System.out.println();
		int year = sc.nextInt();
		
		//윤년인지 아닌지 구별하는 코드 작성
		if(year%4 == 0 && year%100 != 0) { //4의 배수, 100의 배수가 아닌지 판별
			System.out.println(1);
		} else if(year%400 == 0) { //400의 배수인지 판별
			System.out.println(1);
		} else { //나머지
			System.out.println(0);
		}
		
		//삼항으로 하기
		System.out.println((year%4 == 0 && year%100 != 0)? 1 : (year%400 == 0)? 1 : 0);
		
	}
}
