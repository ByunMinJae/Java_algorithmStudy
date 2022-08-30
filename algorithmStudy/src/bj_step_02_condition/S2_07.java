package bj_step_02_condition;

import java.util.Arrays;
import java.util.Scanner;

public class S2_07 {
	//주사위 세개
	//조건에 따라 상금을 계산하는 문제
	public static void main(String[] args) {
		
		//3개의 주사위값 대입
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		//조건에 따라 상금 배분 코드
		if(a == b && b == c) {
			System.out.println(10000+(a*1000));
		} else if(a == b || b == c) {
			System.out.println(1000+(b*100));
		} else if(a == c) {
			System.out.println(1000+(a*100));
		} else {
			if(a > b && a > c) {
				System.out.println(a*100);
			} else if(b > c) {
				System.out.println(b*100);
			} else {
				System.out.println(c*100);
			}
		}
		
		//새로 배운것
		
		//1. Arrays.sort() 메소드
		//		Arrays.sort() 를 통해 배열이나 리스트를 간편하게 정렬할 수 있다
		//		오름차순, 내림차순 다 가능하다
		int[] arr1 = {2, 23, 4, 14, 31};
		Arrays.sort(arr1);
		
		for(int i=0; i<arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		} //2 4 14 23 31
		
		//2. for문에서 :(콜론)의 기능
		int[] arr2 = {1, 2};
		for(int i : arr2) { 
			//for(A : B) : B에서 차례대로 객체를 꺼내서 A에다가 넣겠다
			//(B에 더이상 꺼낼 객체가 없을때 까지)
		      System.out.print("[" + i + "]");
		    }
		
	}
}
