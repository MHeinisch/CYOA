import java.util.Scanner;

public class CYOA
{
	public static void main (String args[])
	{	
		String passOrRun;
		int chance;
		int scoreHome = 0;
		
		Player Rodgers = new Player("Aaron Rodgers", 12, 99);
		Player Nelson = new Player("Jordy Nelson", 87, 93);
		Player Lacy = new Player("Eddie Lacy", 27, 90);
		
		Player Cutler = new Player("Jay Cutler", 6, 79);
		Player Jeffery = new Player("Alshon Jeffery", 17, 90);
		Player Forte = new Player("Matt Forte", 22, 90);
		
		Scoreboard scoreboard = new Scoreboard(0, 0);
		
		Possession possession = new Possession(true);
		
		System.out.println("Time to play a drive of football, good luck!");
		System.out.println();
		System.out.println("Do you want to pass or run the ball?");
		System.out.println("Enter \"P\" for pass or \"R\" for run!");

		do
		{
		Scanner choice = new Scanner (System.in);
		passOrRun = choice.next();
		if (passOrRun.equalsIgnoreCase("P"))
		{
			System.out.println("You chose to pass the ball!");
			chance = Rodgers.PassAndCatch(Rodgers, Nelson);
			
			if (chance > 95)
			{
				possession.Touchdown(scoreHome);
				break;
			}
			else if  (chance > 85)
			{
				possession.YardsGained(20);
			}
			else if (chance > 65)
			{
				possession.YardsGained(10);
			}
			else if (chance > 55)
			{
				Nelson.Drop("Jordy Nelson");
			}
			else
			{
				possession.Interception();
				break;
			}
		}
		else if (passOrRun.equalsIgnoreCase("R"))
		{
			System.out.println("You chose to run the ball!");
			chance = Lacy.Run(Lacy);
			
			if (chance > 95)
			{
				possession.Touchdown(scoreHome);
				break;
			}
			else if (chance > 85)
			{
				possession.YardsGained(20);
			}
			else if (chance > 65)
			{
				possession.YardsGained(10);
			}
			else if (chance > 55)
			{
				possession.YardsGained(0);
			}
			else
			{
				possession.Fumble("Eddie Lacy");
				break;
			}
		}
		else
		{
			System.out.println("Oops! Looks like an invalid option, please try again!");
		}
		} while(!passOrRun.equalsIgnoreCase("P") || !passOrRun.equalsIgnoreCase("R"));	
		
		System.out.println("Great game! Press \"Play\" to play again!");
		
		//Return statements not printing
		//How access and alter a variable from a different class
		//Better way to exit if/else loop other than "break;"
		
		//More functionality is here, just need to add to main
	}
}

