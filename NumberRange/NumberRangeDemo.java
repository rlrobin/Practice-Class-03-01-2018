import java.util.Scanner;
public class NumberRangeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		
		NumberRange myNumber = new NumberRange();
		myNumber.initialize(2, 15);
		//System.out.println("Enter in a low number ");
		//int Lownum = keyboard.nextInt();
		int result = myNumber.getValue();
		
		//System.out.println("Enter in a high number ");
		//int highNum = keyboard.nextInt();
		
		//myNumber.changeValue();
		System.out.println("return number" + result );
		//System.out.println("Your new high number is " + highNum);
	}

}
