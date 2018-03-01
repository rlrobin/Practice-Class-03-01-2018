package lab;
import java.util.Scanner;
public class weekstoDays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Key in the number of weeks you want to convert to days ");
		int weeks=scan.nextInt();
		int days=(weeks*7);
		System.out.println(days);
			}

}
