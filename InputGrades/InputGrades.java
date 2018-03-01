import java.util.Scanner;
public class InputGrades {
	Scanner keyboard = new Scanner(System.in);
	public static void main(String[] args){
	
		public static void studentGrades() {
		
		String studentName = getStudentName();
		int amountOfGrades = getAmountOfGrades();
		double scores[] = getTheirScores(amountOfGrades);
		double average = getTheirAverage(scores);
		provideResults(studentName, average);
	}
		
			public static String getStudentName()
			{
				System.out.println("What is your name? ");
				String name = keyboard.nextLine(); 
			
				return name;
			}
			public static int getAmountOfGrades()
			{
				System.out.println("Enter in the number of grades- ");
				int number = keyboard.nextInt();
			
				return number;
			}
			
			double[] getTheirScores(int amountOfGrades)
			{
				double scores[] = new double[amountOfGrades]
				System.out.println("Enter all grades-  ");
				double sum = 0;
				for(int i=0; i < amountOfGrades; i++) 
				 scores[i] = keyboard.nextDouble();
				
				 sum = sum + scores[i];
		
				return scores;
			}
		
	
			public static double getTheirAverage(double[]scores)
			{
				average = sum/scores.length;
				return average;
			}
			 
			
			public static void provideResults(String studentName, double average)
			{
				System.out.println("The student's name is " + studentName);
				System.out.println("The students average is " + average);
				
			}
				
			
		
	
		   
	}

	public static void main (String[] args)
	{
		for(int i=0; i<=10; i++)
			InputGrades();
	}
}
