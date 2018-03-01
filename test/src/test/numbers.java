package test;
import java.util.Scanner;
public class numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("What is your starting? ");
		int num=scan.nextInt();
		System.out.println("What is your ending number? ");
		int end=scan.nextInt();
		int i=num;
		while(num<=end)
		{
			System.out.println("Number is "+i);
			i=(10+i);
		}
	}

}
