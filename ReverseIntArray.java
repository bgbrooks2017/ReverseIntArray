package main;

public class ReverseIntArray { 
	public static void main(String[] args) {

	int[] Array1 = {1,2,3,4};
	
	int Counter;
	//Forward Array
	for (Counter = 0; Counter < 4; Counter++){
		System.out.print(Array1[Counter]);
	}
	//Space
	System.out.println();
	System.out.println();
	//Flip Array1
	for (Counter= 0 ;Counter<Array1.length/2; Counter++){
		int temp = Array1[Array1.length-1-Counter];
		Array1[Array1.length-1-Counter] = Array1[Counter];
		Array1[Counter]=temp;
	}
	
	//Reverse Array
	for (Counter = 0; Counter < 4; Counter++){
		System.out.print(Array1[Counter]);
	}
	}
}
