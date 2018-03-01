package scanner;
import java.util.Scanner;
public class name {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner name1= new Scanner(System.in);
		
		
		System.out.println("What is your name?");
		String my_name = name1.nextLine();
		
		System.out.println("What is your friends name?");
		String friend_name = name1.nextLine();
		
		
		System.out.println("My name is "+ my_name + " and my friends name is "+ friend_name);

}
}00