import java.util.*;

public class Celcius{

	 public static void main(String[] args) {

	 	double celcius;

	 	System.out.println("Please enter the degrees in Celcius for today: ");
	 	Scanner a = new Scanner(System.in);

	 	celcius = a.nextDouble();

	 	System.out.println ((celcius > 0) ? "It is warm" : "It is Cold");

	 	System.out.println("The weather is currently "+ celcius+" degrees outside");


	 }
}

