import java.util.Scanner;
public class CounterDemo {

	    
	    public static void main(String[] args) {
	        Counter counter = new Counter();
	        System.out.println("Initial is " + counter.getValue());

	        counter.increment();
	        counter.increment();
	        System.out.println(
	            "After two increments, value is " + counter);

	        counter.decrement();
	        System.out.println("After decrement, value is " + counter);

	        System.out.println("Resultalling counter.output() :");
	        counter.output();

	        Counter counter2 = new Counter();
	        System.out.println(counter + " equals " + counter2 + "? " +
	            counter.equals(counter2));

	        counter2.increment();
	        System.out.println(counter + " equals " + counter2 + "? " +
	            counter.equals(counter2));

	        counter2.resetToZero();
	        System.out.println("After getting to zero, value is " + counter2);
	    
		

	}

}
