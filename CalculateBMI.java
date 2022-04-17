/* Write a Java application with the following prototypes that returns the user's body mass index (BMI)  
public static double calcluateBMI(double weight, double height) 
To calculate BMI based on weight in pounds (lb) and height in inches (in), use this formula:  
  and  
public static String findStatus(double bmi) 
Categorizes it as underweight, normal, overweight, or obese, based on the table from the United States Centers for Disease Control: 
BMI 	Weight Status 
Below 18.5 	Underweight 
18.5 – 24.9 	Normal 
25.0-29.9 	Overweight 
30.0 and above 	Obese 
	
Prompt the user to enter weight in pounds and height in inches.
Solution:

*/

import java.util.Scanner;
class BMIClass{
		double BMI;
	public static double calculateBMI(double weight, double height){
		
		return (weight*2.20462/(height*height))*703;
	}
	public static String findStatus(double bmi){
		if(bmi<18.5){
			
			return "Underweight";
		}
		else if(bmi>=18.5 && bmi<=24.9){
			return "Normal";
		}
		else if(bmi>=25.9 && bmi<=29.9){
			return "Overweight";
		}
		else {
			return "Obese";
		}
	}
}
class CalculateBMI{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		BMIClass ob = new BMIClass();
		System.out.print("Enter weight in Kg: ");
		double a = sc.nextDouble();
		System.out.print("Enter height in feet: ");
		double b = sc.nextDouble();
		double bmi = ob.calculateBMI(a,b*12);
		System.out.println(ob.findStatus(bmi));
	}
}
