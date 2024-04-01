package Quest;
//Level_3
public class PitofDespair extends genericQuest
{
	public PitofDespair()
	{
		questName = "Pit of Despair	";
		difficulty = rand.nextInt(15, 20)+3;
		EXPGained = difficulty*2;
		GoldGained = difficulty;
	}

	@Override
	protected String win(hero h) 
	{
		h.addEXP(EXPGained);
		h.gainGold(GoldGained*2);
		return "You gained "+EXPGained+" EXP and "+GoldGained*2;
		
	}

	@Override
	protected String lose(hero h) 
	{
		h.loseLives(1);
		h.loseGold(GoldGained);
		
		return "You lost 1 life and "+GoldGained+" gold";
		
	}

}
