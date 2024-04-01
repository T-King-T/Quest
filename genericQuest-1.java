package Quest;

import Quest.hero;
import java.util.Random;

public abstract class genericQuest {
	
	Random rand = new Random();
	
	protected String questName;
	protected int difficulty;
	protected int GoldGained;
	protected int EXPGained;
	
	public genericQuest()
	{
		questName = "Select a Quest";
		difficulty = 0;
		GoldGained = 0;
		EXPGained = 0;
	}
	
	protected abstract String win(hero h);
	protected abstract String lose(hero h);
	
	public String attemptQuest(hero h)
	{
		
		String x;
		if(((h.getLVL()*rand.nextInt(1,8))+h.getLVL())>difficulty)
		{
			/*
			System.out.println("You successfully finished the quest!");
			win(h);
			System.out.println("You have "+h.getGold()+" gold");
			System.out.println("You have "+h.getLives()+" lives");
			*/
			win(h);
			x = ("You Successfully fininshed the quest!"+System.lineSeparator()+"You gained "+GoldGained+" gold."+System.lineSeparator()+"You have "+h.getLives()+" lives");
		}
		else
		{
			/*
			System.out.println("You failed the quest!");
			lose(h);
			System.out.println("Your level is "+h.getLVL());
			System.out.println("You have "+h.getGold()+" gold");
			System.out.println("You have "+h.getLives()+" lives");
			*/
			lose(h);
			x = ("You failed the quest!"+System.lineSeparator()+"You have "+h.getGold()+" gold."+System.lineSeparator()+"You have "+h.getLives()+" lives");
		}
		return x;
	}
	
	public String toString() 
	{
		return (questName+"	Difficulty: "+difficulty);
	}
	
	public String getName()
	{
		return questName;
	}
	
	public int getDifficulty()
	{
		return difficulty;
	}
	
	
	
}

