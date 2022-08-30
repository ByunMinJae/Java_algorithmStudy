package bj_step_02_condition;

import java.util.Arrays;
import java.util.Scanner;

public class S2_07 {
	//�ֻ��� ����
	//���ǿ� ���� ����� ����ϴ� ����
	public static void main(String[] args) {
		
		//3���� �ֻ����� ����
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		//���ǿ� ���� ��� ��� �ڵ�
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
		
		//���� ����
		
		//1. Arrays.sort() �޼ҵ�
		//		Arrays.sort() �� ���� �迭�̳� ����Ʈ�� �����ϰ� ������ �� �ִ�
		//		��������, �������� �� �����ϴ�
		int[] arr1 = {2, 23, 4, 14, 31};
		Arrays.sort(arr1);
		
		for(int i=0; i<arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		} //2 4 14 23 31
		
		//2. for������ :(�ݷ�)�� ���
		int[] arr2 = {1, 2};
		for(int i : arr2) { 
			//for(A : B) : B���� ���ʴ�� ��ü�� ������ A���ٰ� �ְڴ�
			//(B�� ���̻� ���� ��ü�� ������ ����)
		      System.out.print("[" + i + "]");
		    }
		
	}
}
