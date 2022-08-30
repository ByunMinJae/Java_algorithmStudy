package bj_step_02_condition;

import java.util.Scanner;

public class S2_02 {
	//시험 성적
	//시험 점수를 성적으로 바꾸는 문제
	public static void main(String[] args) {
		
		//시험점수 입력받기
		Scanner sc = new Scanner(System.in);
		System.out.println();
		int num = sc.nextInt();
		
		//시험점수 비교하는 조건문 작성
		if(num >= 90 && num <= 100) {
			System.out.println("A");
		} else if(num >= 80) {
			System.out.println("B");
		} else if(num >= 70) {
			System.out.println("C");
		} else if(num >= 60) {
			System.out.println("D");
		} else {
			System.out.println("F");
		}
		
		//삼항연산자 사용
//		System.out.println((num>=90 && num<=100)?"A" : (num>=80)?"B" : (num>=70)?"C" : (num>=60)?"D" : "F");
		
	}
}
