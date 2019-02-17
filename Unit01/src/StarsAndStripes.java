//� A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class StarsAndStripes
{
	Integer one = 90;
	Integer two = 75;
   public void StarsAndStripesI()
   {
      out.println("StarsAndStripes");
      printTwoBlankLines();
   }

   public void printTwentyStars()
   {
	   out.println("********************");
   }

   public void printTwentyDashes()
   {
	   out.println("--------------------");
   }

   public void printTwoBlankLines()
   {
	   out.println();
	   out.println();
   }
   
   public void printASmallBox()
   {	
	   out.println("######");
	   out.println("#    #");
	   out.println("#    #");
	   out.println("######"); 
   }
 
   public void printABigBox()
   { 
	   out.println("############");
	   out.println("#          #");
	   out.println("#          #");
	   out.println("#          #");
	   out.println("#          #");
	   out.println("############");
   }  
   public void printSmileyEyes()
   {
	   out.println("############\t   #");
	   out.println("#          #\t   #");
	   out.println("#    $$    #\t   #");
	   out.println("#    $$    #\t   #");
	   out.println("#          #\t   #");
	   out.println("############\t   #");
	   out.println();
   }
   public void OwnDesignI()
   {
      out.println("Own Design for Extra Credit");
      printTwoBlankLines();
   }
   public void PrintOwnDesign()
   {
	   printTwentyDashes();
	   out.println();
	   printSmileyEyes(); 
	   printSmileyEyes();
	   printTwentyDashes();
	   out.println();
   }
   public StarsAndStripes()
   {
			System.out.print(one.compareTo(two));
   }
   
   		
}