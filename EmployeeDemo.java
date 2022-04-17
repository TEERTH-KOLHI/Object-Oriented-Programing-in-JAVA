/* Write a program by creating an 'EmployeeInfo' class having the following methods and print the final salary.
1 - 'getInfo()' which takes the salary, number of hours of work per day of employee as parameter
2 - 'AddWork()' which adds $5 to salary of employee if the number of hours of work per day is more than 6 hours.



	Solution: By taking input from the user:
*/

import java.util.Scanner;
class EmployeeInfo{
	int salary;
	double hoursPerDay;
	

	void getInfo(int s, double h){
		salary = s;
		hoursPerDay = h;	
	}

	void AddWork(){
		if(hoursPerDay>6){
			salary = salary+5;
		}
	}
}
class EmployeeDemo{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the salary: ");
		int input = sc.nextInt();
		System.out.print("Enter the number of hours per day: ");
		int hours = sc.nextInt();
		EmployeeInfo employee = new EmployeeInfo();	
		employee.getInfo(input,hours);
		employee.AddWork();
		System.out.println("The final salary is: "+employee.salary+"$");
	}
}
