//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

import java.util.Scanner; 

public class PerfectRunner
{
	public static void main( String args[] )
	{
		//add test cases
		Scanner keyboard = new Scanner(in);
		
		out.print("Give me a number: ");
		int num = keyboard.nextInt();
		
		Perfect test = new Perfect(num);
		test.isPerfect();
		System.out.println(test.toString());
	}
}