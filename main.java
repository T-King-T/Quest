package driver;

import java.util.Scanner;

public class main
{

	public static void main(String[] args) 
	{
		int i = 1;
		while(i == 1)
		{
		Game newGame = new Game();
		newGame.playGame();
		
		Scanner in = new Scanner(System.in);
		

		
		if (newGame.gameStatus() == true)
		{
			//wins += 1;
		}
		else if (newGame.gameStatus() == false)
		{
			//losses += 1;
		}
		//System.out.println("Wins: "+wins+"  Loses: "+losses);
		//.out.println("Want to play again 1 for yes or 0 for no");
		i = in.nextInt();
		
		
		}
	}

}
