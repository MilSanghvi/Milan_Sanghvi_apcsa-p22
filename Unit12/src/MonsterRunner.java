//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import static java.lang.System.*;

public class MonsterRunner
{
	public static void main( String args[] )
	{
		Scanner keyboard = new Scanner(System.in);
		
		//ask for name and size
		System.out.print("Enter 1st monster's name : ");
		String name = keyboard.nextLine();
		
		System.out.print("Enter 1st monster's size: ");
		int size = keyboard.nextInt();
		keyboard.nextLine();
		
		//instantiate monster one
		Skeleton monster1 = new Skeleton(name, size);
		
		//ask for name and size
		System.out.print("Enter 2nd monster's name : ");
		name = keyboard.nextLine();
		
		System.out.print("Enter 2nd monster's size : ");
		size = keyboard.nextInt();
		
		//instantiate monster two
		Skeleton monster2 = new Skeleton(name, size);
		
		//print monsters one and two
		System.out.println("\n" + "Monster 1 - " + monster1);
		System.out.println("Monster 2 - " + monster2 + "\n");
		
		if(monster1.isSmaller(monster2)) System.out.println("Monster one is smaller than Monster two.");
		else if(monster1.isBigger(monster2)) System.out.println("Monster one is bigger than Monster two.");
			
		if(!monster1.namesTheSame(monster2)) System.out.println("Monster one does not have the same name as Monster two.");
		else System.out.println("Monster one has the same name as Monster two.");
		
		System.out.print("Enter 1st Skeleton's name : ");
		name = keyboard.next();
		
		System.out.print("Enter 1st Skeleton's size : ");
		size = keyboard.nextInt();
		keyboard.nextLine();
		
		Skeleton skel1 = new Skeleton(name, size);
		
		System.out.print("Enter 1st Zombie's name : ");
		name = keyboard.nextLine();
		
		System.out.print("Enter 1st Zombie's size : ");
		size = keyboard.nextInt();
		keyboard.nextLine();
		
		Zombie zombie1 = new Zombie(name, size);
		
		if(skel1.isSmaller(zombie1)) System.out.println("Skeleton 1 is smaller than Zombie 1.");
		else if(skel1.isBigger(zombie1)) System.out.println("Skeleton 1 is bigger than Zombie 1.");
			
		if(!skel1.namesTheSame(zombie1)) System.out.println("Skeleton 1 does not have the same name as Zombie 1.");
		else System.out.println("Skeleton 1 has the same name as Zombie 1.");	
	}
}