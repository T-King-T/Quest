package Quest;

public class hero {

	private int EXP;
	private int LVL;
	private int Gold;
	private int Lives;
	
	
	public hero()
	{
		EXP=0;
		LVL=1;
		Gold=0;
		Lives=5;
	}
	
	public void addEXP(int e)
	{
		EXP += e;
		if(EXP >= (LVL*10))
		{
			EXP = (EXP-(LVL*10));
			LVL++;
			//System.out.println("You leveled up!");
		}
		/*System.out.println("You gained "+e+" experience");
		System.out.println("Your current level is "+getLVL());*/
	}
	
	public void gainLives(int l)
	{
		if(l>0) 
		{
			Lives+=l;
			//System.out.println("You gained "+l+" life!");
		}
	}
	public void loseLives(int l)
	{
		if(l>0)
		{
			Lives=Lives - l;
			//System.out.println("You lost "+l+" life!");
		}
	}
	
	public void gainGold(int g)
	{
		if(g>0)
		{
			Gold=Gold+g;
			//System.out.println("You gained "+g+" gold!");
		}
	}
	public void loseGold(int g)
	{
		if(Gold <= g)
		{
			Gold = 0;
		}
		else
		{
			Gold -= g;
		}
	}
	
	public int getGold()
	{
		return Gold;
	}
	
	public int getLives()
	{
		return Lives;
	}
	
	public int getLVL()
	{
		return LVL;
	}
	
	public int getEXP()
	{
		return EXP;
	}
	
	public boolean isVictory()
	{
		boolean victory = false;
		if (Gold <= 100)
		{
			victory = true;
		}
		else
			victory = false;
		
	return victory;
	}
}
