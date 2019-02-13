import static java.lang.System.*;

public class StringEqualityRunner
{
	public static void main( String args[] )
	{
		//add test cases
		StringEquality newString = new StringEquality();
		
		newString.setWords("hello", "goodbye");
		System.out.println(newString.toString() );
		
		newString.setWords("one", "two");
		System.out.println(newString.toString() );
		
		newString.setWords("three", "four");
		System.out.println(newString.toString() );
		
		newString.setWords("TCEA", "UIL");
		System.out.println(newString.toString() );
		
		newString.setWords("State", "Champions");
		System.out.println(newString.toString() );
		
		newString.setWords("ABC", "ABC");
		System.out.println(newString.toString() );
		
		newString.setWords("ABC", "CBA");
		System.out.println(newString.toString() );
		
		newString.setWords("Same", "Same");
		System.out.println(newString.toString() );
	}
}