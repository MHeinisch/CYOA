public class Scoreboard
{
	public static int scoreHome;
	int scoreAway;
	int turnsRemaining;
	
	public Scoreboard(int ScoreH, int ScoreA)
	{
		scoreHome = ScoreH;
		scoreAway = ScoreA;
	}
	
	public int Touchdown(int score)
	{
		System.out.println("You scored a touchdown!");
		return score += 7;
	}
	public int FieldGoal(int score)
	{
		return score += 7;
	}
	public String displayCurrentScore(int scoreHome, int scoreAway)
	{
		return "The score is " + scoreHome + "-" + scoreAway + ".";
	}
}
