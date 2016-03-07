public class Player
{
	String name;
	int jerseyNumber;
	int skill;
	int yardsGained;
	
	public Player(String Name, int JerseyNumber, int Skill)
	{
		name = Name;
		jerseyNumber = JerseyNumber;
		skill = Skill;
	}
	
	public int PassAndCatch(Player player1, Player player2)
	{
		int skillAverage = (player1.skill + player2.skill) / 2;
		double chanceWithSkill = (skillAverage + PercentChance()) / 2;
		int percentChanceWithSkill = (int)Math.round(chanceWithSkill);
		return percentChanceWithSkill;
	}
	public int Run(Player player)
	{
		int skill = player.skill;
		double chanceWithSkill = (skill + PercentChance()) / 2;
		int percentChanceWithSkill = (int)Math.round(chanceWithSkill);
		return percentChanceWithSkill;
	}
	public String Drop(String player)
	{
		System.out.println(player + " dropped the ball, incomplete pass!");
		return player + " dropped the ball, incomplete pass!";
	}
	public double PercentChance()
	{
		return Math.random() * 99 + 1;
	}
}
