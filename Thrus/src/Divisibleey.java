import java.util.Scanner;
public class Divisibleey {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Key in a number to check if its divisible by 2 and 3");
		int num=scan.nextInt();
		boolean check =((num%2==0)&&(num%3==0));
		if (check)
		{
			System.out.println("True"); 
		}
		else
		{
			System.out.println("False"); 
		}
	}

}
