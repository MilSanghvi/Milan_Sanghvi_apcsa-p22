//(c) A+ Computer Science
//www.apluscompsci.com
//Name

import static java.lang.System.*;

import java.util.Scanner;

public class WordRunner
{
	public static void main ( String[] args )
	{
		//add test cases		
		Scanner keyboard = new Scanner(in);
		
		out.print("What would would you like backwards? Enter: ");
		String word = keyboard.nextLine();
		
		Word test = new Word(word);
		test.getFirstChar();
		test.getLastChar();
		test.getBackWards();
		out.println(test.toString());
		
	}
}