//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Milan Sanghvi
//Date - 2/10/19
//Class - Period 2
//Lab  -
import static java.lang.System.*;
import java.util.Scanner;

public class Discount
{
	public static double getDiscountedBill(double bill)
	{
		if (bill > 2000) {
			bill = bill *.85;
			
			System.out.println("The Bill after discount is :: " + bill);
			return bill;
		}
		else {
			
			System.out.println("The Bill after discount is :: " + bill);
			return bill;
		}
		
	}
}