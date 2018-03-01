package lab80;
import java.util.Scanner;
public class o {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner scan=new Scanner(System.in);
		System.out.println("Sams salary is: (Key in Sams salary)");
		double SamS=scan.nextDouble();
		System.out.println("Maxs salary is: (Key in Maxs salary)");
		double MaxS=scan.nextDouble();
		if(SamS>MaxS)
		{
			System.out.println("Sam's salary is greater than Max's");
		}
		else
		{
			System.out.println("Max's salary is greater than Sam's");
			
		}
	}

}
