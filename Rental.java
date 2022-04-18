/* (a)Create a class named  Movie  that can be used with your video rental business. The Movie  class should track the Motion Picture Association of America (MPAA) rating (e.g., Rated G, PG-13, R), ID Number, and movie title with appropriate accessor and mutator methods. Also create an equals()  method that overrides Object ’s  equals()  method, where two movies are equal if their ID number is identical. Next, create three additional classes named Action ,  Comedy , and Drama  that are derived from  Movie.  Finally, create an overridden method named calcLateFees  that takes as input the number of days a movie is late and returns the late fee for that movie. The default late fee is $2/day. Action movies have a late fee of $3/day, comedies are $2.50/day, and dramas are $2/day. Test your classes from a main  method.   
(b)Extend the previous problem with a  Rental  class. This class should store a  Movie that is rented, an integer representing the ID of the customer that rented the movie, and an integer indicating how many days late the movie is. Add a method that calculates the late fees for the rental. In your main  method, create an array of type Rental  filled with sample data of all types of movies. Then, create a method named lateFeesOwed  that iterates through the array and returns the total amount of late fees that are outstanding.

	Solution:
 */
 
import java.util.Scanner;
class Movie{
	int id;
	String movieTitle;
	String rating;
	int nbDays;
	double lateFee = 2;
	static double totalLateFee =0;
	Movie(){

	}
	void setId(int id){
		this.id = id;
	}
	int getId(){
		return id;
	}
	void setMovieTitle(String movieTitle){
		this.movieTitle = movieTitle;
	}
	String getMovieTitle(){
		return movieTitle;
	}
	void setRating(String rating){
		this.rating = rating;
	}
	String getRating(){
		return rating;
	}
	public boolean equals(Object o){
		Movie ob = (Movie)o;
		if(id ==ob.id){
		    return true;
		}
		else{
		    return false;
		}
	}
	public double calcLateFees(int nbDays){
	    this.nbDays = nbDays;
	    return nbDays*lateFee;
	}
}
class Action extends Movie{
	 double lateFee = 3;
	public double calcLateFees(int nbDays){
	    this.nbDays = nbDays;
		totalLateFee+=nbDays*lateFee;
	    return nbDays*lateFee;
	}
	
}
class Comedy extends Movie{
	double lateFee = 2.50;
	public double calcLateFees(int nbDays){
	    this.nbDays = nbDays;
		totalLateFee+=nbDays*lateFee;
	    return nbDays*lateFee;
	}
}
class Drama extends Movie{
	double lateFee = 2;
	public double calcLateFees(int nbDays){
	    this.nbDays = nbDays;
		totalLateFee+=nbDays*lateFee;
	    return nbDays*lateFee;
	}
}
class Rental extends Movie{
	public static void main(String args[]){
		Movie action = new Action();
		action.setRating("PG-13");
		action.setId(3691);
		action.setMovieTitle("Norm of the North");

		System.out.println("MPAA Rating: "+action.getRating());
		System.out.println("ID Number: "+action.getId());
		System.out.println("Movie Title: "+action.getMovieTitle());
		System.out.println("Late Fee: $"+action.calcLateFees(4)+"\n");
		
		Movie drama = new Drama();
		drama.setRating("R-12");
		drama.setId(7989);
		drama.setMovieTitle(" Kung Fu Panda");
		
		System.out.println("MPAA Rating: "+drama.getRating());
		System.out.println("ID Number: "+drama.getId());
		System.out.println("Movie Title: "+drama.getMovieTitle());
		System.out.println("Late Fee: $"+drama.calcLateFees(3)+"\n");

		Movie comedy = new Comedy();
		comedy.setRating("PG-13");
		comedy.setId(4563);
		comedy.setMovieTitle("Batman v Superman");

		System.out.println("MPAA Rating: "+comedy.getRating());
		System.out.println("ID Number: "+comedy.getId());
		System.out.println("Movie Title: "+comedy.getMovieTitle());
		System.out.println("Late Fee: $"+comedy.calcLateFees(2)+"\n");

		System.out.println("Checking movies that are equal or not: ");
		if(action.equals(drama)){
		    System.out.println("Equal");
		}
		else{
		    System.out.println("Not equal");
		}

		Movie arr[] = {action, drama, comedy};
		int length = arr.length;
		double totalLateFees = lateFeesOwed(length);
		System.out.println("Total late fees: "+totalLateFees);

	}

	static double lateFeesOwed(int length){
		if(length>0){
		return totalLateFee+lateFeesOwed(length-1);
		}
		else{
			return 0;
		}
	}
}