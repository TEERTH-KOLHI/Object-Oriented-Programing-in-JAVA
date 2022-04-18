/* Define a class named Person that contains two instance variables of type String that stores the first name and last name of a person and appropriate accessor and mutator methods. 
Also create a method named displayDetails that outputs the details of a person. 
Next, define a class named Student that is derived from Person, the constructor for which should receive first name and last name from the class Student and also assigns values to student id, course, and teacher name. This class should redefine the displayDetails method to person details as well as details of a student. Include appropriate constructor(s). 
Define a class named Teacher that is derived from Person. This class should contain instance variables for the subject name and salary. Include appropriate constructor(s). Finally, redefine the displayDetails method to include all teacher information in the printout. 
Create a main method that creates at least two student objects and two teacher objects with different values and calls displayDetails for each.

	Solution: 
*/

class Person{
	String firstName;
	String lastName;
	void setFirstName(String fN){
		this.firstName = fN;
	}
	String getFirstName(){
		return firstName;
	}
	void setLastName(String lN){
		this.lastName = lN;
	}
	String getLastName(){
		return lastName;
	}
	void displayDetails(){
		System.out.println("First name: "+firstName+" Last name: "+lastName);
	}	
}
class Student extends Person{
	String id;
	String course;
	String teacherName;
	Student(String id, String course, String teacherName){
		this.id = id;
		this.course = course;
		this.teacherName = teacherName;
	}
	 void displayDetails(){
		//super.displayDetails();
		System.out.println("Id: "+id+" Course: "+course+" teacherName: "+teacherName);
	}
}
class Teacher extends Person{
	String subName;
	int salary = 0;
	Teacher (String subName, int salary){
		this.subName = subName;
		this.salary = salary;
	}
	void displayDetials(){
		System.out.println("Subject Name: "+subName+" Salary: "+salary);
	}
}
class Test{
	public static void main(String args[]){
		Person p = new Person();
		p.setFirstName("Parkash");
		p.setLastName("Kumar");
		p.displayDetails();
		Student s1 = new Student("031-32-0021", " OOP","Salman");
		s1.displayDetails();
		Teacher t1 = new Teacher("Discrete maths",45000);
		t1.displayDetials();
	
	}
}
