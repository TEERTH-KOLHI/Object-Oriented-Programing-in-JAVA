/* Write a recursive function that, given a string s= “OOP is Fun”, print the characters of s in reverse order
Solution: 
*/

class ReverseStr{
	public static void main(String args[]){
		ReverseStr  o = new ReverseStr();
		String str = "OOp is Fun";
		System.out.println(o.reverse(str));
	}
	String reverse(String s){
		if (s==""){
			return s;
		}
		else{
			String r = reverse(s.substring(1))+s.charAt(0);
			return r;	
		}
	}
}
