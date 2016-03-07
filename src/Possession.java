public class Possession
{
	boolean doesHomeTeamPossess;
	int yardsGained = 0;
	public int netYardsGained = 0;
	String team;
	
	public Possession(boolean DoesHomeTeamPossess)
	{
		doesHomeTeamPossess = true;
	}
	
	public int Touchdown(int score)
	{
		netYardsGained = 0;
		System.out.println("You scored a touchdown, you win!");
		return score += 7;
	}
	public int YardsGained(int yardsGained)
	{
		netYardsGained = netYardsGained + yardsGained;
		System.out.println("You gained " + yardsGained + " yards!");	
		System.out.println();
		System.out.println("You've gained " + netYardsGained + " so far this drive.");
		
		if (netYardsGained >= 80)
		{
			Touchdown(Scoreboard.scoreHome); //Got it to work, see Scorebaord class, line 3
		}
		
		return 0;
	}
	public String Interception()
	{
		netYardsGained = 0;
		System.out.println("Interception! Turnover on downs, better luck next time!");
		return "Interception! Turnover on downs!";
	}
	public String Fumble(String player)
	{
		netYardsGained = 0;
		System.out.println(player + " fumbled the ball! Turnover on downs, better luck next time!");
		return player + " fumbled the ball! Turnover on downs.";
	}
}
