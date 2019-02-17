//(c) A+ Computer Science
//www.apluscompsci.com
//Name

import static java.lang.System.*;

public class Word
{
	private String word;

	public Word()
	{
		word = "";
	}

	public Word(String s)
	{
		setString(s);
	}

	public void setString(String s)
	{
		word = s;
	}

	public char getFirstChar()
	{
		char firstChar = word.charAt(0);
		return firstChar;
	}

	public char getLastChar()
	{
		char lastChar = word.charAt(word.length()-1);
		return lastChar;	
	}

	public String getBackWards()
	{
		String back="";
		
		for (int x = word.length()-1; x > -1; x--) 
		{
			back = back + word.charAt(x);
		}
		
		return back;
	}

 	public String toString()
 	{
 		return getFirstChar() + "\n" + getLastChar() + "\n" + getBackWards() + "\n" + word;
	}
}