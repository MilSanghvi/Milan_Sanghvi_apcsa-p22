import java.io.File; 
import java.io.IOException;
import java.util.Scanner;
import java.util.Arrays;
import static java.lang.System.*;

public class WordRunner
{
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner(new File("words.dat"));
		String output = "";

		int size = file.nextInt();
		file.nextLine();
		
		Word[] array = new Word[size];

		for (int x = 0; x < size; x++)
		{
			String s = file.nextLine();
			Word text = new Word(s);
			array[x] = text;
		}
				
		Arrays.sort(array);
		
		int max = 1;
		int total = 0;
		
		while (total < size)
		{
			for (Word x : array)
			{
				//if word length = max print word 
				if (x.toString().length() == max)
					{
						System.out.println(x);
						total++;
					}
			}
			max++;
		}

	}
}
