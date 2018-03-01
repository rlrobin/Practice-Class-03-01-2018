package test;
import java.util.Scanner;
public class morestuff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("What is the grade for student 1?");
		int student1=scan.nextInt();
		System.out.println("What is the grade for student 2?");
		int student2=scan.nextInt();
		System.out.println("What is the grade for student 3?");
		int student3=scan.nextInt();
		int total=(student1+student2+student3);
		int average=(total/3);
		if (average>=90)
		{
			System.out.println("The class average is an A");
		}
		else if ((average<89)&&(average>=80))
		{
			System.out.println("The class average is a B");
		}
		else if((average<79)&&(average>=70))
		{
			System.out.println("The class average is a C");
		}
		else if ((average<69)&&(average>=60))
		{
			System.out.println("The class average is a D ");
		}
		else 
		{
			System.out.println("Class average is a F ");
		}
	}

}
