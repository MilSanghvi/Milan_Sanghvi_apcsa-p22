//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Milan Sanghvi
//Date - 2/06/19
//Class - Period 2
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class NumberVerifyRunner
{
	public static void main ( String[] args )
	{
		//add in input
		System.out.println("5 is odd :: " + NumberVerify.isOdd(5));
		System.out.println("5 is even :: " + NumberVerify.isEven(5));
		
		//add in more test cases
		Scanner keyboard = new Scanner(in);
		out.print("Enter the number :: ");
		int number = keyboard.nextInt();
		
		System.out.println(number+" is odd :: " + NumberVerify.isOdd(number));
		System.out.println(number+" is even :: " + NumberVerify.isEven(number));
		
	}
}