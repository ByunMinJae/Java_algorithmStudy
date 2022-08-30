package bj_step_02_condition;

import java.util.Scanner;

public class S2_06 {
	//오븐 시계
	//범위가 더 넓은 시간 계산 문제
	public static void main(String[] args) {
		
		//시간(h), 분(m), 조리시간(ct) 을 입력받기
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int m = sc.nextInt();
		int ct = sc.nextInt();
		
		if((m+ct)<60) { //m+ct의 값이 60미만인 경우
			System.out.println(h + " " + (m+ct)); //시간에 영향이 없다
		} else if((m+ct)>=60) { //m+ct의 값이 60이상인 경우
			if(h+((m+ct)/60)>=24) { //시간이 24이상인 경우
				System.out.println(h+((m+ct)/60)-24 + " " + ((m+ct)%60));
			} else { //시간이 24미만이 경우
				System.out.println(h+((m+ct)/60) + " " + ((m+ct)%60));
			}
		} 
		
	}
}
