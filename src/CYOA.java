import java.util.Scanner;

public class CYOA
{
	public static void main (String args[])
	{
		
		int recordW;
		recordW = 0;
		int recordL;
		recordL = 0;
		String player;
		
		System.out.println("Congratulations! Following Aaron Rodgers' retirement, you are now the starting quarterback for the Green Bay Packers!");
		System.out.println("Every football game has one defining play that will determine whether you win or lose.");
		System.out.println("Be sure to type the name of the player you choose exactly as it's displayed or you will lose that week for sure!");
		System.out.println("With some smart decision-making and a little luck, you will hopefully guide your team to a winning record and the post-season!");
		System.out.println("Let's get started rookie!");
		
		System.out.println();
		System.out.println("Week 1's defining play: Pass to Nelson or Cobb?");
		
		Scanner choice = new Scanner (System.in);
		player = choice.next();
		
		if (player.equalsIgnoreCase("Nelson") || player.equalsIgnoreCase("Cobb"))
		{
			recordW++;
			System.out.println("Great game! Your current record is " + recordW + "-" + recordL + ".");			
		}
		else
		{
			recordL++;
			System.out.println("Tough loss! Your current record is " + recordW + "-" + recordL + ".");
		}		
		
		System.out.println();
		System.out.println("Week 2's defining play: Pass to Adams or Montgomery?");
		player = choice.next();
		
		if (player.equalsIgnoreCase("Adams"))
		{
			recordW++;
			System.out.println("Great game! Your current record is " + recordW + "-" + recordL + ".");
		}
		else
		{
			recordL++;
			System.out.println("Tough loss! Your current record is " + recordW + "-" + recordL + ".");
		}
		
		System.out.println();
		System.out.println("Week 3's defining play: Pass to Lacy or Starks?");
		player = choice.next();
		
		if (player.equalsIgnoreCase("Lacy"))
		{
			recordW++;
			System.out.println("Great game! Your current record is " + recordW + "-" + recordL + ".");	
		}
		else
		{
			recordL++;
			System.out.println("Tough loss! Your current record is " + recordW + "-" + recordL + ".");
		}		
		
		System.out.println();
		System.out.println("Week 4's defining play: Pass to Rodgers or Quarless?");
		player = choice.next();
		
		if (player.equalsIgnoreCase("Rodgers"))
		{
			recordW++;
			System.out.println("Great game! Your current record is " + recordW + "-" + recordL + ".");	
		}
		else
		{
			recordL++;
			System.out.println("Tough loss! Your current record is " + recordW + "-" + recordL + ".");
		}	
		
		System.out.println();
		System.out.println("Week 5's defining play: Pass to Janis or Cobb?");
		player = choice.next();
		
		if (player.equalsIgnoreCase("Janis") || player.equalsIgnoreCase("Cobb"))
		{
			recordW++;
			System.out.println("Great game! Your current record is " + recordW + "-" + recordL + ".");	
		}
		else
		{
			recordL++;
			System.out.println("Tough loss! Your current record is " + recordW + "-" + recordL + ".");
		}	
		
		System.out.println();
		System.out.println("Week 6's defining play: Pass to Kuhn or Ripkowski?");
		player = choice.next();
		
		if (player.equalsIgnoreCase("Kuhn"))
		{
			recordW++;
			System.out.println("KUUUUUUUUUUUUHN!!!");
			System.out.println("Great game! Your current record is " + recordW + "-" + recordL + ".");	
		}
		else
		{
			recordL++;
			System.out.println("Tough loss! Your current record is " + recordW + "-" + recordL + ".");
		}	
		
		System.out.println();
		System.out.println("Week 7's defining play: Pass to Jones or Abbrederis?");
		player = choice.next();
		
		if (player.equalsIgnoreCase("Jones"))
		{
			recordW++;
			System.out.println("Great game! Your current record is " + recordW + "-" + recordL + ".");
		}
		else
		{
			recordL++;
			System.out.println("Tough loss! Your current record is " + recordW + "-" + recordL + ".");
		}	
		
		System.out.println();
		System.out.println("Week 8's defining play: Pass to Perillo or Backman?");
		player = choice.next();
		
		if (player.equalsIgnoreCase("Perillo"))
		{
			recordW++;
			System.out.println("Great game! Your current record is " + recordW + "-" + recordL + ".");
		}
		else
		{
			recordL++;
			System.out.println("Tough loss! Your current record is " + recordW + "-" + recordL + ".");
		}
			
			System.out.println();
			System.out.println("Week 9's defining play: Pass to Nelson, Cobb, or Jones?");
			player = choice.next();
			
			switch(player)
			{
				case "Nelson":
					recordW++;
					System.out.println("Great game! Your current record is " + recordW + "-" + recordL + ".");
					break;
				case "Cobb":
					recordL++;
					System.out.println("Tough loss! Your current record is " + recordW + "-" + recordL + ".");
					break;
				case "Jones":
					recordL++;
					System.out.println("Tough loss! Your current record is " + recordW + "-" + recordL + ".");
					break;
				default:
					recordL++;
					System.out.println("Tough loss! Your current record is " + recordW + "-" + recordL + ".");
					break;
					
			}
			
			System.out.println();
			System.out.println("Week 10's defining play: Pass to Adams, Montgomery, or Janis?");
			player = choice.next();
			
			switch(player)
			{
				case "Adams":
					recordW++;
					System.out.println("Great game! Your current record is " + recordW + "-" + recordL + ".");
					break;
				case "Janis":
					recordW++;
					System.out.println("Great game! Your current record is " + recordW + "-" + recordL + ".");
					break;
				case "Montgomery":
					recordL++;
					System.out.println("Tough loss! Your current record is " + recordW + "-" + recordL + ".");
					break;
				default:
					recordL++;
					System.out.println("Tough loss! Your current record is " + recordW + "-" + recordL + ".");
					break;
			}
			
			System.out.println();
			System.out.println("Week 11's defining play: Pass to Lacy, Starks, or Kuhn?");
			player = choice.next();
			
			switch(player)
			{
				case "Starks":
					recordW++;
					System.out.println("Great game! Your current record is " + recordW + "-" + recordL + ".");
					break;
				case "Lacy":
					recordL++;
					System.out.println("Tough loss! Your current record is " + recordW + "-" + recordL + ".");
					break;
				case "Kuhn":
					recordL++;
					System.out.println("Tough loss! Your current record is " + recordW + "-" + recordL + ".");
					break;
				default:
					recordL++;
					System.out.println("Tough loss! Your current record is " + recordW + "-" + recordL + ".");
					break;
			}
			
			System.out.println();
			System.out.println("Week 12's defining play: Pass to Rodgers, Perillo, or Quarless?");
			player = choice.next();
			
			switch(player)
			{
				case "Rodgers":
					recordW++;
					System.out.println("Great game! Your current record is " + recordW + "-" + recordL + ".");
					break;
				case "Quarless":
					recordW++;
					System.out.println("Great game! Your current record is " + recordW + "-" + recordL + ".");
					break;
				case "Perillo":
					recordL++;
					System.out.println("Tough loss! Your current record is " + recordW + "-" + recordL + ".");
					break;
				default:
					recordL++;
					System.out.println("Tough loss! Your current record is " + recordW + "-" + recordL + ".");
					break;
			}
			
			System.out.println();
			System.out.println("Week 13's defining play: Pass to Nelson, Jones, or Abbrederis?");
			player = choice.next();
			
			switch(player)
			{
				case "Abbrederis":
					recordW++;
					System.out.println("Great game! Your current record is " + recordW + "-" + recordL + ".");
					break;
				case "Nelson":
					recordL++;
					System.out.println("Tough loss! Your current record is " + recordW + "-" + recordL + ".");
					break;
				case "Jones":
					recordL++;
					System.out.println("Tough loss! Your current record is " + recordW + "-" + recordL + ".");
					break;
				default:
					recordL++;
					System.out.println("Tough loss! Your current record is " + recordW + "-" + recordL + ".");
					break;
			}
			
			System.out.println();
			System.out.println("Week 14's defining play: Pass to Janis, Rodgers, or Starks?");
			player = choice.next();
			
			switch(player)
			{
				case "Janis":
					recordW++;
					System.out.println("Great game! Your current record is " + recordW + "-" + recordL + ".");
					break;
				case "Rodgers":
					recordW++;
					System.out.println("Great game! Your current record is " + recordW + "-" + recordL + ".");
					break;
				case "Starks":
					recordL++;
					System.out.println("Tough loss! Your current record is " + recordW + "-" + recordL + ".");
					break;
				default:
					recordL++;
					System.out.println("Tough loss! Your current record is " + recordW + "-" + recordL + ".");
					break;
			}
			
			System.out.println();
			System.out.println("Week 15's defining play: Pass to Adams, Starks, or Quarless?");
			player = choice.next();
			recordL++;
			System.out.println("Tough loss! Your current record is " + recordW + "-" + recordL + ".");
			
			System.out.println();
			System.out.println("Week 16's defining play: Pass to Nelson, Lacy, Rodgers, or Kuhn?");
			player = choice.next();
			
			if (player.equalsIgnoreCase("Nelson") || player.equalsIgnoreCase("RLacy") || player.equalsIgnoreCase("Rodgers") || player.equalsIgnoreCase("Kuhn"))
			{
				recordW++;
				System.out.println("Great game! Your current record is " + recordW + "-" + recordL + ".");	
			}
			else
			{
				recordL++;
				System.out.println("Tough loss! Your current record is " + recordW + "-" + recordL + ".");
			}	
			
			System.out.println();
			System.out.println("You finished your rookie season with a record of " + recordW + "-" + recordL + "!");
			System.out.println();
			
			if (recordW > 8)
			{
				System.out.println("Congrats, you made the playoffs!!!");
			}
			else
			{
				System.out.println("Sorry, you just missed the playoffs! Better luck next season.");
			}
			choice.close();
	}
}