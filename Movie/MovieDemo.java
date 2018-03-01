
public class MovieDemo {

	public static void main(String[] args) {
		Movie m1 = new Movie("The Adjustment Bureau ", "PG-13");
		m1.addRating(5);
		m1.addRating(5);
		m1.addRating(4);
		m1.addRating(4);
		m1.addRating(5);
		System.out.println(m1.getName() + "," + m1.getRating() + "Average rating : " + m1.getAverage());
		
		Movie m2 = new Movie ("I am Number Four ", "PG-13");
		m2.addRating(3);
		m2.addRating(2);
		m2.addRating(2);
		m2.addRating(4);
		m2.addRating(1);
		System.out.println(m2.getName() + "," + m2.getRating() + "Average rating " + m2.getAverage());

	}

}
