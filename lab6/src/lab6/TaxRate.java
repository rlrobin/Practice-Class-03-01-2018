package lab6;

public class TaxRate {
	public static void main(String [] args) {
		int price= 100;
		double taxRate=0.07;
		double product= (price*taxRate);
		String sentence="The tax on this item is "+product;
		System.out.println(sentence);
		}
	}
