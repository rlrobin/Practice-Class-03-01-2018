package newproject;
import java.util.Scanner;
public class statement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);
		String sent_ence= "What is the users name? ";
		System.out.println(sent_ence);
		String name= input.nextLine();
		System.out.println("What is your age? ");
		String age=input.nextLine();
		String sent2="My name is "+name+" and my age is "+age;
		System.out.println(sent2);
	}

}
