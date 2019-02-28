//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class RayDown
{
	//go() will return true if all numbers in numArray
	//are in decreasing order [31,12,6,2,1]
	public static boolean go(int[] numArray)
	{
		int num = numArray[0];
		
		for (int x = 1; x < numArray.length; x++)
		{
			if (num <= numArray[x])
			{
				return false;
			}
		}
		
		return true;
	}	
}