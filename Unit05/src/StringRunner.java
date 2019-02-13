import static java.lang.System.*;
import java.util.Scanner;

public class StringRunner
{	
	public static void main ( String[] args )
	{		
		Scanner keyboard = new Scanner(System.in);
		
		StringOddOrEven test = new StringOddOrEven();
		
		//First time		
		System.out.println("Enter a word to have its length analyzed. \n");
		String input = keyboard.nextLine();
			
		test.setString(input);
		test.isEven();		
		System.out.println(test);
		
		//Second time
		System.out.println("Enter a word to have its length analyzed. \n");
		input = keyboard.nextLine();
			
		test.setString(input);
		test.isEven();		
		System.out.println(test);
		
		//Third time
		System.out.println("Enter a word to have its length analyzed. \n");
		input = keyboard.nextLine();
			
		test.setString(input);
		test.isEven();		
		System.out.println(test);
		
	}
}