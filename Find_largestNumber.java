/* Find largest among three numbers using if..else as well as operators statement

Enter value a:30

Enter value b:10

Enter value c:70
*/

//	Solution: 
	
import java.util.Scanner;
class Find_largestNumber{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number1: ");
		int num1 = sc.nextInt();
		System.out.print("Enter number2: ");
		int num2 = sc.nextInt();
		System.out.print("Enter number3: ");
		int num3 = sc.nextInt();
		if(num1 > num2 && num1 > num3){
			System.out.println("The largest number is: " + num1);
		}
		else if(num2 > num1 && num2 > num3){
			System.out.println("The largest number is: " + num2);
		}
		else if(num3 > num1 && num3 > num2){
			System.out.println("The largest number is: " + num3);
		}
	}
}
