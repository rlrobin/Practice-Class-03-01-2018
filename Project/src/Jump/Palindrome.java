package Jump;
import java.util.Scanner;
public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.Scanner scan=new Scanner(System.in);
		System.out.println("Key in a number ");
		int num=scan.nextInt();
		int originalNumber= num;
		int palindrome = originalNumber;
		int reverse = 0;
		
		while(palindrome!=0)
		{
			int remainder = palindrome % 10;
			reverse=(reverse * 10) + remainder;
			palindrome =(palindrome/10);
		}
		if(reverse == originalNumber)
		{
			System.out.println("It is a palidrome ");
		}
		else 
		{
			System.out.println("It is not a palidrome ");
		}
	}

}
