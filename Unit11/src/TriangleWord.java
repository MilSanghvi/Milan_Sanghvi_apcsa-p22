//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import static java.lang.System.*;

public class TriangleWord
{
	//instance variables and constructors could be present, but are not necessary
		
	public static void printTriangle(String word)
	{
		int num = 1;
		
		for (int row = 0; row < word.length(); row++) 
		{
			for (int col = 0; col < num; col++) 
			{
				System.out.print(word.substring(0, num));
			}
			num++;
			System.out.print("\n");
		}
	}
}