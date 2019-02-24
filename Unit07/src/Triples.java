//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import static java.lang.System.*;

public class Triples
{
   private int number;

	public Triples()
	{
		setNum(0);
	}

	public Triples(int num)
	{
		setNum(num);
	}

	public void setNum(int num)
	{
		number = num;
	}
	
	private int greatestCommonFactor(int a, int b, int c)
	{
		int max = 0;
		for(int i = 1; i <= a; i++)
		{
			if(a % i == 0 && b % i == 0 && c % i == 0)
				max = i;
		}
		return max;
	}

	public String toString()
	{
		String output="";
		for(int i = 1; i < number; i++) 
		{
			for(int j = i; j < number; j++) 
			{
				if(i % 2 == j % 2) j++;
				for(int k = j; k < number; k++)
				{
					if(Math.pow((double)i, 2) + Math.pow((double)j, 2) == Math.pow((double)k, 2))
						if(greatestCommonFactor(i, j, k) < 2)
							output += i + " " + j + " " + k + "\n";
				}
			}
		}
		return output+"\n";
	}
}