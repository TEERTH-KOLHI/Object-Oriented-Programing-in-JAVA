/* Implement classes: Shape, Circle and Rectangle based on the class diagram and description below:  
Class Point implementation is given as follow:  
 
class Point {  
     private int x;  private int y;  
     public Point(int x, int y) {  this.x = x;  this.y = y;  }  
     public int getX() { return x;}  
     public int getY() { return y;}  
     public double distanceTo(Point p) {  
     return Math.sqrt((x-p.getX())*(x-p.getX())+  (y-p.getY())*(y-p.getY()));  
     }  
     public String toString() {  return "("+x+", "+y+")";  }  
}  
Class Shape has:  
•An attributes of type Point, specifies the center of the shape object.  
•A constructor that allows to initialize the center attribute with the value of the passed parameter  
•A method that takes an object of type Point as a parameter and returns true if the point resides within the shape’s area, and false otherwise.  
Class Circle has: 
•An attribute of type integer specifies the radius measure of the circle  
•A constructor that takes a Point parameter to initialize the center and an integer parameter to initialize the radius  
•A getRadius method to return the value of the attribute radius  
•An overriding version of toString method to return the attribute values of a Circle object as String  

Class Rectangle has:  
•Two integer attributes represents the length and width of the Rectangle object  
•A constructor to initialize the center, length and width attribute for a new Rectangle object  
•Methods getLength and getWidth returns the values of attributes length and width respectively 
•An overriding version of toString method to return the attribute values of a Rectangle object as a String  
Class ShapesArray  
 
•displayrectsinfo() display all rectangles information  
•getCirclecounter():int return the number of circles  
•getAvgAreas():double return the average area of all shapes  
•removeallrect() delete all rectangles  
Exercise 2(b)			
Step 6: Putting it all Together  
Implementation TestShape as given.  
create ShapesArray object with size=20  
Display these options  
1.add new shape  
a.for rectangle (ask for details)  
b.for circle (ask for details)  
2.display all rectangles  
3.display the average shapes area  
4.display the number of circles  
5.remove all rectangles  
6.exit  



	Solution: 
*/
import java.util.*;
class Shape{
	Point p = new Point();
	Shape(Point p){
		this.p = p;
	}
	Shape(){
	
	}
	Point getCenter(){
		return p;
	}
	boolean contains(Point point){
		if(p.getX()==point.getX() && p.getY()==point.getY()){
			return true; 
		}
		else{
			return false;
		}
	}
}
class Circle extends Shape{
	static int num = 0;
	private int radius;
	Circle(int radius, Point c){
		super(c);
		this.radius = radius;
		num++;
	}
	public double getRadius(){
		return radius;
	}
	public String toString(){
		return "Radius of Circle is: "+radius;
	}
	double getArea(){
		return (3.14*radius*radius);
	}
}
class Rectangle extends Shape{
	private int length;
	private int width;
	static int num2=0;
	Rectangle(int length, int width, Point c){
		super(c);
		this.length = length;
		this.width = width;
		num2++;
	}
	Rectangle(){

	}
	
	int getLength(){
		return length;
	}
	int getWidth(){
		return width;
	}
	public String toString(){
		return "Length: "+length+" Width: "+width+" Area of rectangle: "+getArea();
	}
	public double getArea(){
	
		return length*width;
	}
}
// Agreggation
class Point{
	private int x;
	private int y;
	public Point(int x, int y){
		this.x = x;
		this.y = y;
	}
	Point(){

	}
	int getX(){
		return x;
	}
	int getY(){
		return y;
	}
	double distanceTo(Point p){
		return Math.sqrt((x-p.getX())*(x-p.getX())+  (y-p.getY())*(y-p.getY()));
	}
	public String toString(){
		return "("+x+","+y+")";
	}
}

// Composition
class ShapeArray{
	int nbShape=0;
	int size;
	Shape shapeList[];
	Circle circle;
	Rectangle rectangle;
	
	ShapeArray(int size){
		this.size = size;
		shapeList = new Shape[size];
	}
	boolean addShape(Shape p){
		if(nbShape<shapeList.length){
		
			shapeList[nbShape++] = p;
			return true;
		}
		else{
			return false;
		}	
	}
	int getCircleCounter(){
		
		return Circle.num;
	}
	double getAvgRectArea(){
			double avArea =0;
			for(int i=0;i<nbShape;i++){
				if(shapeList[i] instanceof Rectangle){
					Rectangle rectangle1 = (Rectangle)shapeList[i];
					avArea+=rectangle1.getArea();
				}
			}
			return avArea/Rectangle.num2;
	}
	void removeAllRect(){
		for(int i=0;i<nbShape;i++){
			if(shapeList[i] instanceof Rectangle){
				for(int j=i,m=j+1;j<nbShape;j++,m++){
					shapeList[j] = shapeList[m];
				}
				nbShape--;
			}
		}
	}
	public String toString(){
		return "";
	}
	void displayrectsinfo(){
		int number =1;
		for(int i=0;i<shapeList.length;i++){
			if(shapeList[i]instanceof Rectangle){
				Rectangle rectangle2 = (Rectangle)shapeList[i];
				System.out.println("Length of rectangle" +(number++)+" is "+rectangle2.getLength()+"\n Width is: "+rectangle2.getWidth()+"\nArea is: "+rectangle2.getArea()+"\n");
			}
		}
	} 

	double getAvgAreas(){
		double totalArea=0;
		for(int i=0; i<shapeList.length; i++){
			
			if(shapeList[i] instanceof Rectangle)
			{
				Rectangle r = (Rectangle)shapeList[i];
				totalArea = totalArea+r.getArea();

			}
		}

		return totalArea/Rectangle.num2;

	}


}
class TestShape{
	public static void main(String args[]){
		ShapeArray object = new ShapeArray(20);
		Point point = new Point(3,5);
		
		Shape shape = new Shape(point);
		Circle circle1 = new Circle(3,point);
		Circle circle2 = new Circle(6,point);
		Circle circle3 = new Circle(10,point);
	
		Rectangle rectangle1 = new Rectangle(3,6,point);
		Rectangle rectangle2 = new Rectangle(6,7,point);
		Rectangle rectangle3 = new Rectangle(10,12,point);
		

		object.addShape(circle1);
		object.addShape(circle2);
		object.addShape(circle3);
		object.addShape(rectangle1);
		object.addShape(rectangle2);
		object.addShape(rectangle3);
		System.out.println("***************************************************");
		System.out.println("Detials about rectangle is given below: ");
		object.displayrectsinfo();
		double averageArea = object.getAvgAreas();
		
		
		System.out.println("Average agrea: "+averageArea);
		System.out.println();
		
		
		int n = object.getCircleCounter();
		System.out.println("Number of Circles in Array: "+n);
		object.removeAllRect();
		System.out.println("***************************************************");
	}
}