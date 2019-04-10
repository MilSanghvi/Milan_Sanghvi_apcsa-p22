import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class NumberShifter
{
	public static int[] makeLucky7Array( int size)
	{
		int[] array = new int[size];
		
		for (int x = 0; x < array.length; x++)
		{
			array[x] = (int)(Math.random()*10)+1;
		}
		
//		shiftEm(array);
		
		return array;
	}
	
	public static void shiftEm(int[] array)
	{
		int beg = 0;
		for (int x = 0; x < array.length; x++)
		{
			if (array[x] == 7)
			{
				int temp = array[beg];
				array[beg] = 7;
				array[x] = temp;
				beg++;
			}
		}
	}
}