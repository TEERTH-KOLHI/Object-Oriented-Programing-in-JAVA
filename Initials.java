// Write a program that computes your initials from your full name and displays them.


//Solution:

import java.lang.*;
class Initials{
	public static void main(String[] args){
		String FullName = "Teerth Kolhi";
		System.out.println(FullName.charAt(0));
		for(int i = 0; i< FullName.length();i++){
			if(FullName.charAt(i) ==' ') {
				System.out.println(FullName.charAt(i+1));
			}
		}
	}

}
