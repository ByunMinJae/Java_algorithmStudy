package bj_step_02_condition;

import java.util.Scanner;

public class S2_05 {
	//�˶� �ð�
	//�ð� ��� ����
	public static void main(String[] args) {
		
		//�� ���� H, M�Է¹ޱ�
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int M = sc.nextInt();
		
		//������ ��� �˶���
		if(H != 0 && M < 45) {
			System.out.println((H-1) + " " + (60-(45-M)));
		} else if(H == 0 && M < 45) {
			System.out.println(((H+24)-1) + " " + (60-(45-M)));
		} else {
			System.out.println(H + " " + (M-45));
		}
		
	}
}
