package bj_step_02_condition;

import java.util.Scanner;

public class S2_02 {
	//���� ����
	//���� ������ �������� �ٲٴ� ����
	public static void main(String[] args) {
		
		//�������� �Է¹ޱ�
		Scanner sc = new Scanner(System.in);
		System.out.println();
		int num = sc.nextInt();
		
		//�������� ���ϴ� ���ǹ� �ۼ�
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
		
		//���׿����� ���
//		System.out.println((num>=90 && num<=100)?"A" : (num>=80)?"B" : (num>=70)?"C" : (num>=60)?"D" : "F");
		
	}
}
