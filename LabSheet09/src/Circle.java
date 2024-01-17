
public class Circle {
	//The public constants
	public static final double DEFAULT_RADIUS = 1.0;
	public static final String DEFAULT_COLOR = "red";
	
	//The private 2 attributes
	private double radius;
	private String color;
	
	//Construct a Circle with default radius and color
	//1st(default) Construct
	Circle(){
		this.radius = DEFAULT_RADIUS;
		this.color = DEFAULT_COLOR;
	}
	
	//Constructs a Circle with the given radius and default color
	//2nd Construct
	Circle(double radius){
		this.radius = radius;
		this.color = DEFAULT_COLOR;
	}
	
	//Constructs a Circle with the given radius and color
	//3nd Construct
	Circle(double radius,String color){
		this.radius = radius;
		this.color = color;
	}
	
	//Returns the radius-the public getter for private attribute radius
	public double getRadius() {
		return this.radius;
	}
	
	//Set the radius-the public setter for private variable radius
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public String getColor() {
		return this.color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public String toString() {
		return "Circle[radius="+this.radius+", color= "+color+"]";
	}
	
	//Return the area of this Circle
	public double getAres() {
		return Math.PI * Math.pow(radius, 2);
		//return Mth.PI * radius * radius;
	}
	
	//Return the circumference of this Circle
	public double getCircumference(){
		return 2.0 * Math.PI * radius;
	}

}
