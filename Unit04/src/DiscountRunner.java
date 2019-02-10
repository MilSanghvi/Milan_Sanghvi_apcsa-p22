//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Milan Sanghvi
//Date - 2/06/19
//Class - Period 2
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class DiscountRunner
{
	public static void main( String args[] )
	{
		Scanner keyboard = new Scanner(System.in);
		
		out.print("Enter the original bill amount :: ");
		double amt = keyboard.nextDouble();
		Discount d = new Discount();
		d.getDiscountedBill(amt);
		

	}
}