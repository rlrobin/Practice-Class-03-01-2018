import java.util.Scanner;
public class EvenorOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Key in a String of characters to check if odd or even, True for Even and False for Odd ");
		String text=scan.nextLine();
		System.out.println(Check(text));
	}
public static String Check(String text)
{
	int Length=text.length();
	if (Length%2==0)
	{
		return "True";
	}
	else
	{
		return "False";
	}
}
}
