/* Find Greatest Common Divisor (GCD) of 2 numbers using recursion. Numbers should be taken as an input from user.

Solution:
*/

import java.util.Scanner;
class GCDCalculation{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		GCDCalculation ob = new GCDCalculation();
		System.out.print("Enter two numbers: ");
		int GCD = ob.gcdCalculation(sc.nextInt(),sc.nextInt());
		System.out.println(GCD);
	}
	int gcdCalculation(int x, int y){
		if(y!=0){
			return gcdCalculation(y,x%y);
		}
		else{
			return x;
		}
	}
}
