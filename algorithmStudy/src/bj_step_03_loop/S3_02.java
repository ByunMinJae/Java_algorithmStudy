package bj_step_03_loop;

//A+B - 3
//�� ���� A�� B�� �Է¹��� ����, A+B�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.

import java.util.Scanner;

public class S3_02 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] testCase = new int[sc.nextInt()];
		
		for( int i=0; i<testCase.length; i++ ) {
			
			int A = sc.nextInt();
			int B = sc.nextInt();
			
			testCase[i] = A+B;
			
			System.out.println(testCase[i]);
			
		}
		
	}
	
}
