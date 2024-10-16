package functionalProgramming;

public class FilterPosition {
	
	public static void main(String[] args) {
		
		int[] array= {2,5,3,4,6,7,9,8};
		for(int i= 0 ;i<array.length;i++) {
			
			if(i%2!=0) {
				System.out.println(array[i]);
			}
		}
		
		
		
	}

}
