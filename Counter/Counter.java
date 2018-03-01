import java.util.Scanner;
public class Counter

 {
   
    public int value = 0;
    public Counter(){
    this.value = 0;
}
         
       public int getValue()
       {
           return value;
       }       
       public int increment()
       {
           return value++;
       }       
       public int decrement()
       {
           return value--;
       }
       public int resetToZero()
       {
           return value=0;
        }
        public String toString() {
             return Integer.toString(value); 
        }

   
    public void output() {
        System.out.println("Counter is " + value);
    }

}