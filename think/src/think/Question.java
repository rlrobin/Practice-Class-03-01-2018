package think;
import java.util.Scanner;
public class Question {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("first number? ");
		int first=scan.nextInt();
		System.out.println("second number? ");
		int second =scan.nextInt();
		System.out.println("third number? ");
		int third= scan.nextInt();
		if ((first>third)&&(first > second))
		{
			System.out.println("This is the greatest number "+first);
	    }
		else((second>first)&&(second>third))
		{
			System.out.println("This is the greatest number "+ second);
		}
		else
		{
			System.out.println("This is the greatest number "+ third);
		}

}
}