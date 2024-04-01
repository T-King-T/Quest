package driver;

import Quest.*;
import java.util.Random;
import java.util.Scanner;


public class game {

	
	//function to randomly select a quest from the list
		static genericQuest randQuest()
		{
			Random rand = new Random();
			int i = rand.nextInt(5);
			genericQuest x = null;
			switch (i)
			{
			case 0:  x = new TrainingGrounds();
			break;
			case 1:  x = new WarriorTraining();
			break;
			case 2:  x = new FieldofBeginnings();
			break;
			case 3:  x = new CaveofSorrows();
			break;
			case 4:  x = new PitofDespair();
			break;
			}
		return x;
		}
		
		//main
		public static void main(String[] args)
		{
			int h;
			Scanner in = new Scanner(System.in);
			hero hero = new hero();
			genericQuest[] quests = new genericQuest[10];
			for(int i = 0; i<10; i++)									//populate am array with the randomly selected quests
			{
				quests[i] = randQuest();
			}
			
			do
			{
				System.out.println("Pick a Quest to Begin!");
				for(int i = 0; i<10; i++)									//populate am array with the randomly selected quests
				{
					System.out.println((i+1)+".	"+quests[i]);
				}
				h = in.nextInt();
				System.out.println("You Seleceted "+quests[h-1].getName());
				System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
				if(h > 0 && h <=10)
					{
					quests[h-1].attemptQuest(hero);
					quests[h-1] = randQuest();
					}
				System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
			}while(h != 0 && hero.getLives() >= 1 && hero.getGold() <= 100 );
		}

}
