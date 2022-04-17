/* Write a static method named lastDigit that returns the last digit of an integer. For example, lastDigit(3852) should return 2 

Solution:
*/

class LastDigit{

	static int lastDigit(int a){
		return (a%10);
	}
}
class FindLastDigit{
	public static void main(String args[]){
		LastDigit ob = new LastDigit();
		int r = ob.lastDigit(3852);
		System.out.println(r);
	}
}
