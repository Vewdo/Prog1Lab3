import java.util.Scanner;
public static void main(String[] args) {
    
        double height;
        double weight;
        double kilos;
        double meters;

        Scanner w = new Scanner(System.in);
        System.out.println("Enter weight in pounds");
        weight = w.nextDouble();
        Scanner h=new Scanner(System.in);
        System.out.println("Enter height in feet");
        height = h.nextDouble();
        

       meters = 0.3048*height;
       kilos= 0.453592*weight;
       
       double bmi= kilos/(meters*meters);
       
       

       if (bmi<18.5) {
        System.out.println("You are classified as underweight");
       }
       else if (bmi >= 18.5 && bmi<= 24.9){
        System.out.println("Your are classified as normal");
       }
       else if (bmi >= 30.0) {
        System.out.println("You are classified as overweight");
       }

       System.out.println("Your weight is "+ kilos + " Kilos and your height is "+ meters+"m high with a bmi of " +bmi+ " Kg/(m2). ");

    }
    
}
