package lab;
import java.util.Scanner;
public class Taxes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("What is the item priced at? ");
		double pretax=scan.nextDouble();
		double taxRate= 0.07;
		double tax= (pretax*taxRate);
		double total=(pretax+tax);
		System.out.println("After tax this item is $" +total);
		
	}

}
