package hhhh;
import java.util.Scanner;
public class gotit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Key in any number");
		int num=scan.nextInt();
		if(num<0)
		{
			System.out.println("The number you entered is negative ");
		}
		else if(num>0)
		{
			System.out.println("The number you entered is positive ");
		}
		else
		{
			System.out.println("The number you entered is 0");
		}
	}

}
