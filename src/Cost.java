import java.util.Scanner;

public class Cost {

	public static void main(String[] args) 
	{
		Scanner in = new Scanner (System.in);
		System.out.println("What type of vehicle do you have?");
		String car = in.nextLine();
		
		
	
		switch (car){
		case "Sedan":
			
			
			System.out.println("How many miles do you want to drive?");
			if (in.hasNextDouble()) 
			{
				double miles = in.nextDouble();
				
				double cost = miles * 2.50;
				System.out.println("This is the cost of the Sedan trip: " + cost);
			}
			else
			{
				System.out.println("Miles should be a number!");
			}
			break;
		
		case "SUV":
			
			System.out.println("How many miles do you want to drive?");
			if (in.hasNextDouble()) 
			{
				double miles = in.nextDouble();
				
				double cost = miles * 2.90;
				System.out.println("This is the cost of the SUV trip: " + cost);
			}
			else
			{
				System.out.println("Miles should be a number!");
			}
			
			break;
		
		case "Truck":
			
			System.out.println("How many miles do you want to drive?");
			if (in.hasNextDouble()) 
			{
				double miles = in.nextDouble();
				
				double cost = miles * 2.70;
				System.out.println("This is the cost of the Truck trip: " + cost);
			}
			else
			{
				System.out.println("Miles should be a number!");
			}
			
			break;
		
		default:
			System.out.println("Not a valid car");
			
		}
			
		

	}

}
