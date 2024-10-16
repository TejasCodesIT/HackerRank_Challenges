package functionalProgramming;

import java.util.Scanner;

public class FilterArray {
	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a value which should is ");
		int value=  sc.nextInt();
		
		System.out.println("Enter size of an array :- ");
		int size = sc.nextInt();
		
		int[] array = new int[size];
		
		
		for(int i = 0 ; i <size-1; i++)
		{
			System.out.println("Enter a value in array :- ");
			array[i]=sc.nextInt();
		}
		
		for(int i = 0 ; i<size-1 ; i++) {
			
			if(array[i]<value) System.out.println(array[i]);
			
		}

		
	}

}
