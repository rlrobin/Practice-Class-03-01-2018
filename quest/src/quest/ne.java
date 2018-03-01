package quest;
import java.util.Scanner;
public class ne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int i;
		int e;
		System.out.println("What is the starting number? ");
		i=scan.nextInt();
		System.out.println("What is the ending number? ");
		e=scan.nextInt();
		while(i<=e)
		{
			System.out.println("Number is "+i);
			i=(i+10);
		}
	}

}
