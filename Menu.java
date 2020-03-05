import java.util.*;

public class Menu {

	public static void main(String [] args){
Scanner keyboard = new Scanner(System.in);

		System.out.println("Please choose one of the options: ");
		System.out.println("(1) Meters to Feet");
		System.out.println("(2) CAD to USD");
		System.out.println("(3) Celsius to Fahrenheit");
		System.out.println("(4) Minute Converter");
		System.out.println("(5) Meters to Centimeters");

		int choice = keyboard.nextInt();
		String greeting = "";




		switch(choice){
			case 1:
			double feet,meters;

			System.out.println("Please enter the amount of Meters you want in feet: ");

			Scanner a = new Scanner(System.in);

			meters = a.nextDouble();

			feet = meters * 3.2808399;

			System.out.println("You have: "+feet+ " ft.");
			break;

			case 2:
		
		Double CAD;      
        Double USD;
      
        
		Scanner canadien$= new Scanner(System.in);
        
        System.out.println("Enter Canadien dollars to be converted: ");
        
        CAD = canadien$.nextDouble();
        
        USD=CAD*0.76;
       
        System.out.println ("If we have: " + CAD + " Canadien $ then we have: "+ USD + " USA dollars");
			break;

			case 3: 
				double celcius,fahrenheit;

			System.out.println("Please enter the amount of Celsius you want in Fahrenheit: ");

			Scanner b = new Scanner(System.in);

			celcius = b.nextDouble();

			fahrenheit = (celcius * 9/5) + 32;

			System.out.println("You have: "+fahrenheit+ " fahrenheit");
			break;

			case 4: 
		
		Scanner in = new Scanner(System.in);
        System.out.print("Enter the amount of seconds you want in minutes: ");
        int seconds = in.nextInt(); 
        
        int sec = seconds % 60;
        int p2 = seconds / 60;
        
        
        System.out.print( p2 + ":" + sec);
			
			break;

			case 5: 
			double centimeter,meter;

			System.out.println("Please enter the amount of Meters you want in Centimeters: ");

			Scanner c = new Scanner(System.in);

			meter = c.nextDouble();

			centimeter = meter * 100;

			System.out.println("You have: "+centimeter+ " cm.");
			break;

			default:
			greeting = "Invalid";
		}

	}
}