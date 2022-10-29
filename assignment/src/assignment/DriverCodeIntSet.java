package assignment;

//import java.util.Arrays;
import java.util.Scanner;

public class DriverCodeIntSet {
	 public static void main(String args[]) {
		  Scanner sd = new Scanner(System.in);
		  System.out.println("Enter the size of the input1");
		  int size  = sd.nextInt();
		  int[] input1= new int[size];
		  System.out.println("Enter the elements");
		  for(int iterator = 0;iterator<input1.length;iterator++) {
			  System.out.print("Enter the "+ (iterator+1)+" element: ");
			  input1[iterator] = sd.nextInt();
		  }
//		  IntSetClass operation = new IntSetClass(input1);
//		  System.out.println("Enter the element to be checked");
//		  int check = sd.nextInt();
//		  System.out.println("Element status in the array is "+operation.isMember(check));
//		  System.out.println("Size of the array is "+ operation.size());
//		  int arr[]= {1,2};
//		  System.out.println("Array status is "+operation.isSubSet(arr));
//		  int[] complementOutput = operation.getComplement(arr);
//		  System.out.println("Complement of array is "+Arrays.toString(complementOutput));
//		  int[] unionOutput = operation.union(arr);
//		  System.out.println("union of both arrays are "+Arrays.toString(unionOutput));
		  sd.close();
//	
		  
	  }
}
