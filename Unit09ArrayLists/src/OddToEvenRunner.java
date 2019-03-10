//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

import java.util.ArrayList;
import java.util.Arrays;

public class OddToEvenRunner
{
	public static void main( String args[] )
	{
		System.out.println(ListOddToEven.go(Arrays.asList(7, 1, 5, 3, 11, 5, 6, 7, 8, 9, 10, 12345, 11)));
		System.out.println(ListOddToEven.go(Arrays.asList(10, 20, 30, 40, 5, 41, 31, 20, 11, 7)));
		System.out.println(ListOddToEven.go(Arrays.asList(2, 7, 11, 5, 21, 7)));
		System.out.println(ListOddToEven.go(Arrays.asList(2, 4, 6, 8, 8)));
	}
	
	
}