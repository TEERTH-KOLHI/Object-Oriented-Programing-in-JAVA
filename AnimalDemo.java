/* Create a Parent Class name Animal with instance variable name, age and gender, also a method name ProduceSound().
1.Create child classes of Animal Dog, Frog, Kitten and Tomcat. Dog, Frog, Cats are animal.  Kittens are female cats and Tomcats are male cats. Define useful constructors and methods.
2.Modify the ProduceSound() method inherited by child class by its type "e.g for Dog ProduceSound("Bow wow")". 
●Hint: method OverRiding will be used( MayBe just a keyWord would be used and everything else would be same as parent class).
3.Create an array of different kind of animals and calculate the average age of each kind of animals. (hint: you can use instanceOf method for this task)

	Solution:
*/

abstract class Animal{
    String name;
    int age;
    String gender;
    abstract void produceSound();
}
class Dog extends Animal{
    Dog(String name, int age){
        this.name = name;
        this.age = age;
    }
    void produceSound(){
        System.out.println("Sound of dog is: Bow wow");
    }
}
class Frog extends Animal{
    Frog(String name,int age){
        this.name = name;
        this.age = age;
    }
    void produceSound(){
        System.out.println("Sound of frog is: Darrrrrrr");
    }
}
class Kitten extends Animal{
    Kitten(String name, int age){
        this.name = name;
        this.age = age;
    }
    void produceSound(){
        System.out.println("Sound of Kitten is: emoun...emoun");
    }
}
class Tomcat extends Animal{
    Tomcat(String name, int age){
        this.name = name;
        this.age = age;
    }
    void produceSound(){
        System.out.println("Sound of tomcat is: Mewou mewou...");
    }
}
public class AnimalDemo{
    public static void main(String args[]){
        Dog dog = new Dog("Dog",12);
        Frog frog = new Frog("Frog",3);
        Kitten kitten = new Kitten("Kitten",2);
        Tomcat tomcat = new Tomcat("tomcat",4);

	System.out.println("******************************************************");
	System.out.println("Sound of each animal is given below. ");
	Animal arr[] = {dog, frog, kitten, tomcat};
		for(int i=0;i<arr.length;i++){
			arr[i].produceSound();
		}
	
	System.out.println("******************************************************");
		int sum = 0;
		double average = 0;
		for(int i=0;i<arr.length;i++){
			sum = sum+arr[i].age;
		}
		average = (sum/arr.length);
		System.out.println("Average age of each animal is: "+average);
	System.out.println("******************************************************");
    }
}