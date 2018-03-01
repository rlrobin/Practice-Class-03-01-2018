package newproject;
import java.util.Scanner;
public class triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("What is the height of the triangle? ");
		double scan1=scan.nextDouble();
		System.out.println("What is the base of the triangle? ");
		double scan2=scan.nextDouble();
		double area= (scan1*scan2);
		String sentence= "The area of your triangle is "+area;
		System.out.println(sentence);
		
	}

}
