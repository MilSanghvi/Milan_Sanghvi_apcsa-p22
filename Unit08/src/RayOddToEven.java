//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class RayOddToEven
{
	public static int go(int[] ray)
	{
		for (int x = 0; x < ray.length; x++)
		{
			if (ray[x]%2 == 1)
			{
				for (int y = x+1; y < ray.length; y++)
				{
					if (ray[y]%2 == 0)
					{
						return y - x;
					}
				}
			}
		}
		return -1;
	}
}