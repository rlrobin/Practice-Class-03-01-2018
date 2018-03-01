package lab;
import java.util.Scanner;
public class work {
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		System.out.println("Key in an interger ");
		int num=scan.nextInt();
		System.out.println("Key in another integer ");
		int num2=scan.nextInt();
		int total=(num+num2);
		System.out.println("The total of the two integers: "+total);
		double difference=(num-num2);
		System.out.println("The difference between the two: "+difference);
		int product=(num*num2);
		double quotion=(num/num2);
		System.out.println("Quotion: " +num+ "/" +num2+ "=" +quotion);
	}
}
