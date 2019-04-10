import java.util.*;
import java.io.*; 

public class WordSearch
{
    private String[][] m;

    public WordSearch( int size, String str )
    {
    	m = new String[size][size];
    	int pos = 0;
    	for(int i = 0; i < size; i++)
    	{
    		for(int j = 0; j < size; j++)
    		{
    			m[i][j] = str.substring(pos, pos + 1);	
    			pos++;
    		}
    	}
    }

    public boolean isFound( String word )
    {
    	for(int i = 0; i < m.length; i++)
    	{
    		for(int j = 0; j < m[i].length; j++)
    		{
    			if(m[i][j].equals(word.substring(0, 1)))
    			{
    				if(checkRight(word, i, j)) return true;
    				if(checkLeft(word, i, j)) return true;
    				if(checkUp(word, i, j)) return true;
    				if(checkDown(word, i, j)) return true;
    				if(checkDiagUpRight(word, i, j)) return true;
    				if(checkDiagUpLeft(word, i, j)) return true;
    			}
    			
    		}
    	}

    	return false;
    }

	public boolean checkRight(String w, int r, int c)
   {
		int count = 0;
		if(m[r].length - c < w.length()) return false;
		
		for(int k = c; k < w.length() + c; k++)
		{		
			if(m[r][k].equals(w.substring(count, count+1))) count++;
			else return false;
		}
		
		if(count == w.length()) return true;
			
		return false;
	}

	public boolean checkLeft(String w, int r, int c)
	{
		int count = 0;
		if(c < w.length()) return false;
		
		for(int i = c; i > c - w.length(); i--)
		{
			if(m[r][i].equals(w.substring(count,  count+1))) count++;
			else return false;
		}
		
		if(count == w.length()) return true;
		return false;
	}

	public boolean checkUp(String w, int r, int c)
	{
		int count = 0;
		if(r < w.length()) return false;
		
		for(int i = r; i > r - w.length(); i--)
		{
			if(m[i][c].equals(w.substring(count,  count+1))) count++;
			else return false;
		}
		
		if(count == w.length()) return true;
		return false;
	}

	public boolean checkDown(String w, int r, int c)
   {
		int count = 0;
		if(m[r].length - r < w.length()) return false;
		
		for(int i = r; i < r + w.length(); i++)
		{
			if(m[i][c].equals(w.substring(count,  count+1))) count++;
			else return false;
		}
		
		if(count == w.length()) return true;
		return false;
	}

	public boolean checkDiagUpRight(String w, int r, int c)
	{
		int count = 0; 
		if(r < w.length() || m[r].length - c < w.length()) return false;
		
		for(int i = r; i > r - w.length(); i--)
		{
			if(m[i][c].equals(w.substring(count,  count+1))) count++;
			else return false;
			c++;
		}
		if(count == w.length()) return true;
		return false;
	}

	public boolean checkDiagUpLeft(String w, int r, int c)
	{
		int count = 0;
		if(c < w.length() || r < w.length()) return false;
		
		for(int i = r; i > r-w.length(); i--)
		{
			if(m[i][c].equals(w.substring(count,  count+1))) count++;
			else return false;
			c--;
		}
		
		if(count == w.length()) return true;
		return false;
	}

	public boolean checkDiagDownLeft(String w, int r, int c)
   {
		int count = 0;
		if(m.length-r < w.length() || c < w.length()) return false;
		
		for(int i = r; i < r + w.length(); i++)
		{
			if(m[i][c].equals(w.substring(count,  count+1))) count++;
			else return false;
			c--;
		}
		
		if(count == w.length()) return true;
		return false;
	}

	public boolean checkDiagDownRight(String w, int r, int c)
	{
		int count = 0;
		if(m.length - r < w.length() || m[r].length - c < w.length()) return false;
		
		for(int i = r; i < r + w.length(); i++)
		{
			if(m[i][c].equals(w.substring(count,  count+1))) count++;
			else return false;
			c++;
		}
		 
		if(count == w.length()) return true;
		return false;
	}

    public String toString()
    {
    	String output = "";
    	for(String[] s : m)
    	{
    		for(String t : s)
    		{
    			output += t + " ";
    		}
    		output += "\n";
    	}
    	return output;
    }
}
