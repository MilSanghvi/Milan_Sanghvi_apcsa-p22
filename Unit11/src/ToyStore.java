//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import static java.lang.System.*;

public class ToyStore
{
	private ArrayList<Toy> toyList;

	public ToyStore()
	{
		loadToys("");
	}

	public ToyStore(String nm)
	{
		loadToys(nm);
	}
	
	public void loadToys( String toys )
	{
		toyList = new ArrayList<Toy>();
		String[] toy = toys.split(" ");
		
		for(int i = 0; i < toy.length; i++)
		{
			boolean repeat = false;
			for(Toy t : toyList)
			{
				if(t.getName().equals(toy[i]))
				{
					t.setCount(t.getCount() + 1);
					repeat = true;
				}	
			}
			if(!toys.equals("") && !repeat) toyList.add(new Toy(toy[i]));
		}	
	}
  
  	public Toy getThatToy( String nm )
  	{
  		for(Toy t : toyList)
  		{
  			if(t.getName().equals(nm)) return t;
  		}
  		return null;
  	}
  
  	public String getMostFrequentToy()
  	{
  		Toy most = toyList.get(0);
  		for(Toy t : toyList)
  		{
  			if(t.getCount() > most.getCount()) most = t;
  		}
  		return most.getName();
  	}  
  
  	public void sortToysByCount()
  	{
  		boolean isSorted = false;
  		
  		while(!isSorted)
  		{
  			int count = 0;
  			for(int i = 0; i < toyList.size()-1; i++)
  			{
  				if(toyList.get(i).getCount() < toyList.get(i+1).getCount())
  				{
  					Toy swap = toyList.get(i);
  					toyList.set(i, toyList.get(i+1));
  					toyList.set(i+1, swap);
  				}
  				else count++;
  			}
  			if(count == toyList.size()-1) isSorted = true;
  		}
  	}  
  	  
	public String toString()
	{
		Toy[] print = new Toy[toyList.size()];
		return Arrays.toString(toyList.toArray(print));
	}
}