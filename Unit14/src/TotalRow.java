//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.*;

public class TotalRow
{
    public static List<Integer> getRowTotals( int[][] m )
    {
    	List<Integer> result = new ArrayList<Integer>();
    	for(int[] rows : m)
    	{
    		int sum = 0;
    		for(int num : rows) sum += num;
    		result.add(sum);
    	}
		return result;
    }
}