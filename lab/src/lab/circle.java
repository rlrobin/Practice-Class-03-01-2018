package lab;
import java.util.Scanner;
public class circle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("What is the radius of the circle? ");
		double radius=scan.nextDouble();
		double diameter=(2*radius);
		double circumference=(2*3.14*radius);
		double area=(3.14*radius*radius);
		System.out.println("Diameter: "+diameter );
		System.out.println("Circumference: "+circumference);
		System.out.println("Area: "+area);
	}

}
