// Write Java code to identify if the given input by the user is even or odd.
//	Solution:

import java.util.Scanner;
class EvenOdd{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int number = sc.nextInt();
		if(number%2==0){
			System.out.println("The number is even");
		}
		else if(number !=0){
			System.out.println("The number is odd");
		}
	}
}
