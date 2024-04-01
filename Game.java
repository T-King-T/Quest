package driver;

import java.util.Random;
import java.util.Scanner;

import Quest.CaveofSorrows;
import Quest.FieldofBeginnings;
import Quest.PitofDespair;
import Quest.TrainingGrounds;
import Quest.WarriorTraining;
import Quest.genericQuest;
import Quest.hero;
import java.awt.event.ActionEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.awt.event.ActionListener;

import javax.imageio.ImageIO;
import javax.swing.*;

public class Game implements GameInter, ActionListener
{
	
	private JFrame myCanvas;
	private JButton button[];
	private JTextPane pane, pane1, pane3, pane4;
	
	
	public Game() 
	{
	
		myCanvas = new JFrame();									//canvas
		myCanvas.setBounds(75,50,800,800);
		myCanvas.setLayout(null);
		button = new JButton[10];
		for(int i = 0; i < 10; i++)									//JButtons
		{
			button[i] = new JButton();
			button[i].setBounds(5,i*69,350,64);
			button[i].setVisible(true);
			button[i].addActionListener(this);
			myCanvas.add(button[i]);
		}
		
		pane = new JTextPane();										//text panes
		pane.setEditable(false);
		pane.setBounds(400,100,128,32);
		pane.setText("Lives: "+hero.getLives());
		myCanvas.add(pane);
		
		pane1 = new JTextPane();
		pane1.setEditable(false);
		pane1.setBounds(400, 200, 128, 32);
		pane1.setText("Gold: "+hero.getGold());
		myCanvas.add(pane1);
		
		pane3 = new JTextPane();
		pane3.setEditable(false);
		pane3.setBounds(400, 300, 400, 400);
		pane3.setText("Select a Quest to Accept");
		myCanvas.add(pane3);
		
		pane4 = new JTextPane();
		pane4.setEditable(false);
		pane4.setBounds(400, 50, 128, 32);
		pane4.setText("Level: "+hero.getLVL());
		myCanvas.add(pane4);
		
		
		
		myCanvas.setVisible(true);
	}
	
	
	
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
	hero hero = new hero();
	int h;
	Scanner in = new Scanner(System.in);
	
	genericQuest[] quests = new genericQuest[10];
			
				@Override
				public void playGame() 
				{					
					quests = new genericQuest[10];
					for(int i = 0; i<10; i++)									//populate am array with the randomly selected quests
					{
					quests[i] = randQuest();
					button[i].setText(quests[i].getName()+"   Diff: "+quests[i].getDifficulty());
					
					}
				}
				
				
				@Override
				public boolean gameStatus() 
				{
					boolean b = false;
					if (hero.getLives() < 1)
					{
						b = false;
					}
					else if(hero.getGold() > 100)
					{
						b =  true;
					}
					return  b;
					
					
				}
				@Override
				public void actionPerformed(ActionEvent e)
				{
					int buttonNumber = -1;
					for (int i = 0; i < button.length; i++)
					{
						if(button[i] == e.getSource())
						{
						buttonNumber = i;
						break;
						}
					}
					quests[buttonNumber].attemptQuest(hero);
					quests[buttonNumber] = randQuest();
					button[buttonNumber].setText(quests[buttonNumber].toString());
					pane3.setText(quests[buttonNumber].attemptQuest(hero));
					
					pane.setText("Lives: "+hero.getLives());
					pane1.setText("Gold: "+hero.getGold());
					pane4.setText("Level: "+hero.getLVL());
					
					try {

						BufferedImage img = null;

						img = ImageIO.read(new File("Custom dimensions 64x64 px.png"));

						ImageIcon mi = new ImageIcon(img);

						button[buttonNumber].setIcon(mi);


						}

						catch (Exception ex) {

						System.out.println(ex);
						
					}
				
				{
					

						
				
				
				
				
}
}}


