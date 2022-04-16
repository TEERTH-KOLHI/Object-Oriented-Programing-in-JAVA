/* Write a Java program to replace each substring of below given sample string 
	a.	Sample string : "The quick brown fox jumps over the lazy dog."
	b.	In the above string replace all the fox with cat
*/

//Solution: 
	class Replacement{
	public static void main(String[] args){
		String str = "The quick brown fox jumps over the lazy dog.";
		String replace_str = str.replace("fox","cat");
		System.out.println(replace_str);
	}

}
