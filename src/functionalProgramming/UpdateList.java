package functionalProgramming;

public class UpdateList {
	
	public static void main(String[] args) {
		
		
		int[] array = {2,-4,3,-1,23,-4,-54};
		
		for(int i = 0 ; i <array.length;i++) {
			
			
			if(array[i]<0) {
				
				array[i]*=-1;
				
			}
	           	System.out.println(array[i]);
			
		}
		
		
		
	}

}
