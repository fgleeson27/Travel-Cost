import java.util.Scanner;

public class Cost {

	public static void main(String[] args) 
	{

		Scanner in = new Scanner (System.in);
		String car = " ";
		car = input ();

		double regularGas = 2.50;
		double plusGas = 2.70;
		double superGas = 2.90;

		switch (car){
		case "Sedan":


			System.out.println("How many miles do you want to drive?");
			if (in.hasNextDouble()) 
			{
				double miles = in.nextDouble();
				System.out.println("How many gallons of gas do you want?");
				double gallons = in.nextDouble();

				double cost = miles * regularGas;
				System.out.println("This is the cost of the Sedan trip: " + cost);
				mpg (miles, gallons);

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
				System.out.println("How many gallons of gas do you want?");
				double gallons = in.nextDouble();

				double cost = miles * superGas;
				System.out.println("This is the cost of the SUV trip: " + cost);
				mpg (miles, gallons);

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
				System.out.println("How many gallons of gas do you want?");
				double gallons = in.nextDouble();

				double cost = miles * plusGas;
				System.out.println("This is the cost of the Truck trip: " + cost);
				mpg (miles, gallons);

			}
			else
			{
				System.out.println("Miles should be a number!");
			}

			break;

		default:
			System.out.println("Not a valid car");

			break;
		}

	}

	public static String input ()
	{

		Scanner in = new Scanner (System.in);
		System.out.println("What type of vehicle do you have?");
		String n = in.nextLine();
		return n;
	}

	public static double mpg (double miles, double gallons) 
	{
		double mpg = miles/gallons;
		System.out.println("The car has  " + mpg + " mpg ");
		return mpg;
	}

}
