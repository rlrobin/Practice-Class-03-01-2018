import java.util.Scanner;
public class NumberRange {
private int lowestNumber;	
private int highestNumber;


public void initialize( int max, int min)
{ highestNumber= max;	
  lowestNumber= min;
  {  if (lowestNumber > highestNumber)
	  max= lowestNumber;
	  min= highestNumber;
  }
}
public int getValue()

{
	System.out.println(" Enter in a value between the numbers 2 and 15 ");
		Scanner keyboard = new Scanner(System.in);
	
		int Value = keyboard.nextInt();
	
	
	while ((Value > highestNumber) ||( Value < lowestNumber))
	{
		System.out.println("Error. Enter in a value between the number range ");
		System.out.println();
		System.out.println(" Enter in a value between the numbers 2 and 15 ");
		Value = keyboard.nextInt();
	}
	 return Value;
}

	
}
    


