package lab;
import java.util.Scanner;
public class integers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan =new Scanner(System.in);
		System.out.println("Key in your first whole number ");
		int num1=scan.nextInt();
		System.out.println("Key in your second whole number ");
		int num2=scan.nextInt();
		System.out.println("Key in your third whole number ");
		int num3=scan.nextInt();
		double average=((num1+num2+num3)/3);
		String sentence="The average for the numbers you provided is "+average;
		System.out.println(sentence);
	}

}
