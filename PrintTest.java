/* Create a class to print an integer and a character with two methods having the same name but different sequence of the integer and the character parameters.
For example, if the parameters of the first method are of the form (int n, char c), then that of the second method will be of the form (char c, int n).

Solution:
*/

class Test{
	void method(int n, char c){
		System.out.println(n);
		System.out.println(c);
	}
	void method(char a, int b){
		System.out.println(a);
		System.out.println(b);
	}
}
class PrintTest{
	public static void main(String args[]){
		Test ob = new Test();
		ob.method(12,'T');
	}
}
