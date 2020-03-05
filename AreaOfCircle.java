import java.util.*;

public class AreaOfCircle{

	 public static void main(String[] args) {

	 	final double PI = 3.14159;

	 	double radius;

	 	System.out.println("Please enter the radius of the circle you'd like to know the area of ");

	 	Scanner a = new Scanner(System.in);

	 	radius = a.nextDouble();

	 	double area = PI * (radius * radius);  

	 	if (radius>0) {
	 		System.out.println("The area is "+ area);
	 		}
	 	else {
	 		System.out.println("ERROR Radius is either 0 or a negative");
	 		}

	}
}