//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class LetterRemoverRunner
{
	public static void main( String args[] )
	{
		//add test cases
		LetterRemover test = new LetterRemover("I am Sam I am", 'a');
		test.removeLetters();
		out.println(test.toString());
		
		test.setRemover("ssssssssxssssesssssesss", 's');
		test.removeLetters();
		out.println(test.toString());
		
		test.setRemover("qwertyqwertyqwerty", 'a');
		test.removeLetters();
		out.println(test.toString());		

		test.setRemover("abababababa", 'b');
		test.removeLetters();
		out.println(test.toString());		
		
		test.setRemover("abaababababa", 'x');
		test.removeLetters();
		out.println(test.toString());		
		
	}
}