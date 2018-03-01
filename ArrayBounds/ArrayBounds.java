import java.util.Scanner;
public class ArrayBounds {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		int[] count = {0,0,0,0};
		System.out.println("Enter ten numbers between 0 and 3. ");
		for (int i =0; i< 10; i++)
		{
			int num = keyboard.nextInt();
			count[num]++;
		}
		
		for (int i =0; i < count.length; i++)
			System.out.println("You entered " + count[i] + " " + i + " 's ");
	}

}
