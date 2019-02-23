//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  Milan Sanghvi

import java.util.Scanner;
import static java.lang.System.*;

public class RockPaperScissors
{
	private String playChoice;
	private String compChoice;

	public RockPaperScissors()
	{
		setPlayers("");
	}

	public RockPaperScissors(String player)
	{
		setPlayers(player);
	}

	public void setPlayers(String player)
	{
		playChoice = player;
		int num = (int)Math.random()*3;
		switch(num)
		{
		case 0:
			compChoice = "R";
			break;
		case 1:
			compChoice = "P";
			break;
		case 2:
			compChoice = "S";
			break;
		}	
	}

	public String determineWinner()
	{
		String winner="";
		if(compChoice.equals(playChoice)) 
			winner = "!Draw Game!\n";
		else if(compChoice.equals("P") && playChoice.equals("R"))
			winner = "!Computer wins <<Paper covers Rock>>!\n";
		else if(compChoice.equals("S") && playChoice.equals("P"))
			winner = "!Computer wins <<Scissors cuts Paper>>!\n";
		else if(compChoice.equals("R") && playChoice.equals("S"))
			winner = "!Computer wins <<Rock breaks Scissors>>!\n";
		else if(playChoice.equals("P") && compChoice.equals("R"))
			winner = "!Player wins <<Paper covers Rock>>!\n";
		else if(playChoice.equals("S") && compChoice.equals("P"))
			winner = "!Player wins <<Scissors cuts Paper>>!\n";
		else if(playChoice.equals("R") && compChoice.equals("S"))
			winner = "!Player wins <<Rock breaks Scissors>>!\n";	
		return winner;
	}

	public String toString()
	{
		String output="player had " + playChoice + "\n" + "computer had " + compChoice + "\n" + determineWinner() + "\nDo you want to play again?";
		return output;
	}
}