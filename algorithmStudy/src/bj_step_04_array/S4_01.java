package bj_step_04_array;

public class S4_01 {
	public static void main(String[] args) {
		
		int[] arr = {20, 10, 35, 30, 7};
		
		int tmp;
		
		for(int i=0; i<arr.length-1; i++) {
			for(int j=0; j<arr.length-1; j++) {
				
				if(arr[j] > arr[j+1]) {
					
					tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp;
					
				}
				
			}
		}
		
		System.out.println(arr[0] + " " + arr[4]);
		
	}
}
