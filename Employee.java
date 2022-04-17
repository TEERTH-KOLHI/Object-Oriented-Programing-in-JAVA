/* Write a program that would print the information (name, year of joining, salary, address) of three employees by creating a class named 'Employee'. The output should be as follows:

Name        Year of joining        Address
Robert            1994                64C- WallsStreat
Sam                2000                68D- WallsStreat
John                1999                26B- WallsStreat. 

Solution:
*/
class Employee{
	String name, address;
	int yearOfJoining,salary;
	public static void main(String args[]){

		Employee e1 = new Employee();
		e1.name="Robert";
		e1.yearOfJoining=1994;
		e1.salary=12000;
		e1.address = "64C- WallsStreat";
		
		Employee e2 = new Employee();
		e2.name = "Sam";
		e2.yearOfJoining = 2000;
		e2.salary=14000;
		e2.address =  "68D- WallsStreat";

		Employee e3 = new Employee();
              	e3.name = "John";
		e3.yearOfJoining = 1999;
		e3.salary=16000;
		e3.address = "26B- WallsStreat.";

		System.out.println("Name	"+"Year of joining	"+"  Address");
		System.out.println(e1.name+"	 "+e1.yearOfJoining+"		 "+e1.address);
		System.out.println(e2.name+"	 "+e2.yearOfJoining+"		 "+e2.address);
		System.out.println(e3.name+"	 "+e3.yearOfJoining+"		 "+e3.address);
	}
}
