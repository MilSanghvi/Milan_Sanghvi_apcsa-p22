import java.util.Arrays; 
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class NumberSorter
{
	//instance variables and other methods not shown

	private static int getNumDigits(int number)
	{
		int count = 0;
		
		int remainder = number;
		
		do{
			remainder = remainder/10;
			count++;
		}while(remainder > 0);
		
		return count;
	}

	public static int[] getSortedDigitArray(int number)
	{
		int[] sorted = new int[getNumDigits(number)];
		int remainder = number;

		for(int x = 0; x < sorted.length; x++)
		{
			sorted[x] = remainder%10;
			remainder = remainder / 10;
		}
		
		for(int i = 0; i < sorted.length-1; i++)
		{
			int min = i; 
			for (int j = i + 1; j < sorted.length; j++)
			{
				if(sorted[j] < sorted[min]) min = j;
			}
			if (min!= i)
			{
				int temp = sorted[min];
				sorted[min] = sorted[i];
				sorted[i] = temp;
			}
		}
		
		return sorted;
	}
}