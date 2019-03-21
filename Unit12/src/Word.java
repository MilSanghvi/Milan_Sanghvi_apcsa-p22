import static java.lang.System.*;

public class Word implements Comparable<Word>
{
	private String word;

	public Word( String s )
	{
		word = s;
	}

	public int compareTo( Word rhs )
	{		
		if(word.length() > rhs.toString().length()) return 1;
		else if(word.length() < rhs.toString().length()) return -1;
		else return word.compareTo(rhs.toString());
	}

	public String toString()
	{
		return word;
	}
}