import java.util.Scanner;
public class Calcoleman {

	public double sum;
	public double num1;
	public double num2;
	public void readInput()
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Which operator would you like to use ?");
		System.out.println("Select 1 for addition, 2 for subtraction, 3 for multiplication or 4 for division  ");
	    int operator = keyboard.nextInt();
		System.out.println("What is your first number? ");
		num1 = keyboard.nextInt();
		System.out.println("What is your second number? ");
		num2 = keyboard.nextInt();

	}

	public int addition()
	{
		sum = num1 + num2;
		return addition();
	}
	
	public int subtraction()
	{
		sum = num1 - num2;
		return subtraction();
	}
	
	public int multiplication()
	{
		sum = num1 * num2;
		return multiplication();
	}
	 public int division()
	 {
		 sum = num1/num2;
		 return division();
	 }
	 
	 public void writeOutput()
	 {
		 System.out.println("Number one = " + num1);
		 System.out.println("Number two = " + num2);
		 System.out.println("The answer is " + sum);{
		 }

	}

}
