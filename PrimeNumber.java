//Write a program to print a table of all prime numbers less than 600 and print out the numbers.
  
//Solution:
 
class PrimeNumber{
	public static void main(String[] args){
	int newline=0;
	for(int i = 1; i<600;i++){
		int j,check=0;
		for(j=2;j<i;j++){
			if(i%j==0){
				check++;
			}
		}
		if(check==0 && i!=1){
			System.out.print(i+" ");
			newline++;
		}
		if(newline==5){
			System.out.println();
			newline = 0;
		}
		check = 0;
	}
	}
}
