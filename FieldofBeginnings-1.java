package Quest;
//Level 1
public class FieldofBeginnings extends genericQuest
{
	public FieldofBeginnings()
	{
		questName = "Field of Beginnings";
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
		return "You lost "+GoldGained+" gold.";
		
	}

}
