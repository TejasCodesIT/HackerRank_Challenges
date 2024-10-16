package functionalProgramming;

public class SumOfOddNumber {
	
	
	public static void main(String[] args) {
		int sum = 0 ;
		
		int[] array = {3,2,4,6,5,7,8,0,1};
		
		
		for(int i = 0 ; i<array.length;i++) {
			
			if(array[i]%2!=0) sum+=array[i];
			
		}
		System.out.println("Sum is "+sum);
		
	}

}
