//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class ToyStoreRunner
{
	public static void main( String args[] )
	{
		ToyStore test = new ToyStore();
		out.println(test);
		
		ToyStore buddy = new ToyStore("sorry bat sorry sorry sorry train train teddy teddy ball ball");
		out.println(buddy);
		out.println("max == " + buddy.getMostFrequentToy());
		buddy.sortToysByCount();
		out.println(buddy);
	}
}