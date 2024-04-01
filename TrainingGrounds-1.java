package Quest;
//Level 0
public class TrainingGrounds extends genericQuest
{
	
	public TrainingGrounds()
	{
		questName = "Training Grounds";
		difficulty = rand.nextInt(1, 5);
		EXPGained = 2*difficulty;
		GoldGained = 0;
	}
	

	@Override
	public String win(hero a) 
	{
		a.addEXP(EXPGained);
		return "You gained "+EXPGained+" EXP";
		
	}

	@Override
	public String lose(hero a) 
	{
		
		//System.out.println("You failed but lost nothing");
		return "You failed but lost Nothing";
	}

	
}
