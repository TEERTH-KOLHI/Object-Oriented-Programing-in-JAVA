/* Write code that creates an array named odds and stores all odd numbers between 1 and 30 into it using a for loop.

Solution:
*/ 
class Odds{
	public static void main(String[] args){
		int arr[] = new int[30];
		for(int i=0;i<arr.length;i++){
			if(i%2==0){

			}
			else{
				arr[i]=i;
				System.out.println(arr[i]);
			}
		}	
		
	}

}
