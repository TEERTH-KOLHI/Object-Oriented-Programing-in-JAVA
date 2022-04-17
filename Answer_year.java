/* Write a program that inputs the year a person is born in and returns the age of the person.
Example: Person born in 1991 then age is 30
 
Solution: 
*/
import java.util.Scanner;
class Year{
    int currentYear;
    int year_of_birth;
    
    Year(int currentYear, int year_of_birth){
        this.currentYear = currentYear;
        this.year_of_birth = year_of_birth;
    }
    
    int getAge(){
        int age = currentYear - year_of_birth;
        return age;
    }
}

class Answer_year{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter current year: ");
        int current_year = sc.nextInt();
        System.out.print("Enter year of birth: ");
        int yearOfBirth = sc.nextInt();
        Year y = new Year(current_year,yearOfBirth);
        System.out.println("The age is: "+y.getAge());
    }
}
