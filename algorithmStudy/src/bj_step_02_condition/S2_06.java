package bj_step_02_condition;

import java.util.Scanner;

public class S2_06 {
	//���� �ð�
	//������ �� ���� �ð� ��� ����
	public static void main(String[] args) {
		
		//�ð�(h), ��(m), �����ð�(ct) �� �Է¹ޱ�
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int m = sc.nextInt();
		int ct = sc.nextInt();
		
		if((m+ct)<60) { //m+ct�� ���� 60�̸��� ���
			System.out.println(h + " " + (m+ct)); //�ð��� ������ ����
		} else if((m+ct)>=60) { //m+ct�� ���� 60�̻��� ���
			if(h+((m+ct)/60)>=24) { //�ð��� 24�̻��� ���
				System.out.println(h+((m+ct)/60)-24 + " " + ((m+ct)%60));
			} else { //�ð��� 24�̸��� ���
				System.out.println(h+((m+ct)/60) + " " + ((m+ct)%60));
			}
		} 
		
	}
}
