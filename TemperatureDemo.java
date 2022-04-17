/* Write a program that inputs temperature in Celsius and converts it into Fahrenheit.

Fahrenheit=1.8 x Celsius +32  

Solution:
*/
 
import java.util.Scanner;
class Temperature{
    double tempInCelsius;
    double fahrenheit;
    
    void displayTemperature(){
        System.out.println("The temperature in Fahrenheit is: "+fahrenheit);
    }
    void conversion(double n){
        tempInCelsius = n;
        fahrenheit = 1.8*tempInCelsius+32;
    }
}

public class TemperatureDemo{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the temperature in Celsius: ");
        double input = sc.nextDouble();
        Temperature t = new Temperature();
        t.conversion(input);
        t.displayTemperature();
    }
}
