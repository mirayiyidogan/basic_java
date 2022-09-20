package Assignment0;

/**
 * The program which takes an array of 10 integers lengths and prints out the minimum value in it.
 * 
 * Name: Miray 
 * Surname: Iyidogan
 * Student ID: 2021719072
 * Date: 18/10/2021
 * 
 */
import java.util.Scanner;
public class Assignment0 {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int[] tenarray= new int[66];
		
		
		System.out.print( "Enter 10 integers: \n");
		for(int x = 0; x<=9; x++) {
			tenarray[x]= sc.nextInt();  		
			}
		int min = tenarray[0];
		
		for(int i = 0; i<=9; i++) {
			if (tenarray[i] < min) min = tenarray[i];
		}
		System.out.print("\nMinimum is: " + min);	
	} 
}
