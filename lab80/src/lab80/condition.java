package lab80;
import java.util.Scanner;
public class condition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
		System.out.println("What is your grade in the class? ");
		int grade=scan.nextInt();
		if(grade>90)
		{
			System.out.println("Congragulations You Earned An A!");
		}
		else
		{
			System.out.println("You did not earn an A");
		}
	}

}
