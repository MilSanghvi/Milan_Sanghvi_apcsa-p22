//(c) A+ Computer Science
//www.apluscompsci.com
//Name

import static java.lang.System.*;

import java.util.Scanner;

public class TriangleOneRunner
{
	public static void main ( String[] args )
	{
		//add test cases		
		Scanner keyboard = new Scanner(in);
		
		out.print("Give me a word: ");
		String word = keyboard.nextLine();
		
		TriangleOne test = new TriangleOne(word);
		test.print();
		
	}
}