//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class RaySumLast
{
	public static int go(int[] ray)
	{
		int sum = 0;
		
		for (int x = 0; x < ray.length; x++)
		{
			if (ray[x] > ray[ray.length-1])
			{
				sum = sum + ray[x];
			}
		}
		
		if (ray.length == 0 || sum == 0)
		{
			return -1;
		}
		
		return sum;
	}
}