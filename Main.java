/* Following is an example of abstract class:
abstract class Player
{
    String name;
    abstract void setName(String str);
    String getName()
    {
        return name;
    }
}
If you try to create an instance of this class like the following line you will get an error:
Player player = new Player(); 
In order to avoid this error solve this problem to create an instance?
Notice that setName method is abstract too and has no body. That means you must implement the body of that method in the child class.
We have provided the abstract Player class. Now you have to write the FootballPlayer class. Your class mustn't be public.
Now create a Main class. In the Main class create an instance of a class called FootballPlayer. 
Get an input from user for a name to enter.
Then print that name.
Sample Input: Aariz Ali
Sample Output:
Football player name is: Aariz Ali

	Solution:
*/
import java.util.Scanner;
abstract class Player{
    String name;
    abstract void setName(String str);
    String getName(){
        return name;
    }
}
class FootballPlayer extends Player{
    void setName(String str){
        this.name = str;
    }
}
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Football player name: ");
        String str = sc.nextLine();
        FootballPlayer footballPlayer = new FootballPlayer();
        footballPlayer.setName(str);
        System.out.println("Football player name is: "+footballPlayer.getName());
    }
}