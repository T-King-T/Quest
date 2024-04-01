package Quest;
//level_2
public class CaveofSorrows extends genericQuest
{

	public CaveofSorrows() 
	{
		questName = "Cave of Sorrows	";
		difficulty = rand.nextInt(10, 15)+2;
		EXPGained = difficulty*2;
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
		h.loseLives(1);
		return "You lost 1 life.";
		
	}
}
