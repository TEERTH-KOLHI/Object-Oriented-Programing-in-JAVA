/*Write a program which solves quadratic equations of the form: ax2 + bx + c = 0. Values of a, b, c can be taken as input from user.
Solution:
*/
import java.util.*;
class SolveQE{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter value of constant a: ");
		double a = sc.nextDouble();
		System.out.print("Enter value of constant b: ");
		double b = sc.nextDouble();
		System.out.print("Enter value of constant c: ");
		double c = sc.nextDouble();
		double discriminant = ((b*b)-(4.0*a*c));
		double root = (-b/(2.0*a));
		if(discriminant > 0.0){
			double root1 = (-b + Math.pow(discriminant, 0.5)) / (2.0 * a);
			double root2 = (-b - Math.pow(discriminant, 0.5)) / (2.0 * a);
			System.out.println("The roots are real: "+root1+" and "+root2);   
		}
		else if(discriminant == 0.0){
			double root1 = (-b / (2.0 * a));  
			System.out.println("The roots are equal: " + root1);
		}
		else if(discriminant < 0.0){
			System.out.println("Roots are Imaginary...");
		}
	}
}
