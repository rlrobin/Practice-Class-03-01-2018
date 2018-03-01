package lab;
import java.util.Scanner;
public class info {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("What is the user's name? ");
		String name=scan.nextLine();
		System.out.println("What is the user's classification? ");
		String clas=scan.nextLine();
		System.out.println("What is the user's age? ");
		int age=scan.nextInt();
		System.out.println("Name :" +name);
		System.out.println("Age :" +age);
		System.out.println("Classification :" +clas);
	}

}
