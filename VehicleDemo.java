/* Create a class Vehicle. The class should have two fields-no_of_seats and no_of_wheels. Create two objects-Motorcycle and Car for this class. Your output should show the descriptions for Car and Motorcycle. 
Solution: 
*/
class Vehicle{
	int no_of_wheels=0;
	int no_of_seats=0;

	Vehicle(int no_of_wheels, int no_of_seats){
		this.no_of_wheels = no_of_wheels;
		this.no_of_seats = no_of_seats;
	}
	void showVehicle(){
		System.out.println(no_of_seats+" seats and "+no_of_wheels+" wheels");
	}
}

class VehicleDemo{
	public static void main(String args[]){
		Vehicle motorCycle = new Vehicle(2,2);
		System.out.print("Motorcycle has ");
		motorCycle.showVehicle();
		
		
		Vehicle car = new Vehicle(4,4);
		System.out.print("Car has ");
		car.showVehicle();
	}
	VehicleDemo(){

	}
}
