package bj_step_02_condition;

import java.util.Scanner;

public class S2_03 {
	//����
	//������ �Ǻ��ϴ� ����
	public static void main(String[] args) {
		
		//�⵵ �Է¹ޱ�
		Scanner sc = new Scanner(System.in);
		
		System.out.println();
		int year = sc.nextInt();
		
		//�������� �ƴ��� �����ϴ� �ڵ� �ۼ�
		if(year%4 == 0 && year%100 != 0) { //4�� ���, 100�� ����� �ƴ��� �Ǻ�
			System.out.println(1);
		} else if(year%400 == 0) { //400�� ������� �Ǻ�
			System.out.println(1);
		} else { //������
			System.out.println(0);
		}
		
		//�������� �ϱ�
		System.out.println((year%4 == 0 && year%100 != 0)? 1 : (year%400 == 0)? 1 : 0);
		
	}
}
