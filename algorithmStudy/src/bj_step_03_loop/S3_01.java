package bj_step_03_loop;

import java.util.Scanner;

public class S3_01 {
	//������
	//�������� ����ϴ� ����
	public static void main(String[] args) {
		
		//������ n�� �Է¹ޱ�
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i=1; i<=9; i++) {
			System.out.println(n + " * " + i + " = " + n*i);
		}
		
	}
}
