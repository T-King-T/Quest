package Quest;
//level_1
public class WarriorTraining extends genericQuest
{

	public WarriorTraining()
	{
		questName = "Warrior Training";
		difficulty = rand.nextInt(6, 10)+1;
		EXPGained = difficulty;
		GoldGained = difficulty;
	}
	@Override
	protected String win(hero h) 
	{
		h.addEXP(EXPGained);
		h.gainGold(GoldGained);
		return "You gained "+EXPGained+" EXP and "+GoldGained;
		
	}

	@Override
	protected String lose(hero h) 
	{
		h.loseGold(GoldGained);
		return "You lost "+GoldGained;
		
	}

}
