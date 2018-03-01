package newproject;
import java.util.Scanner;
public class number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner number= new Scanner(System.in);
		System.out.println("Key a number");
		int num=number.nextInt();
		String sentence= "Your number is "+num;
		System.out.println(sentence);
	}

}
