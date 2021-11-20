package bet_more_game;

import java.util.Scanner;

/**
 * Selects the players and is responsible for starting and finishing the game for the player.
 * 
 * @author Johannes
 *
 */
public class Game_Chair {

	public Player computer = new Player("Computer");
	public Player player_2 = new Player("Player_2");
	public BetMore_Game bet = new BetMore_Game();
	public boolean replay = false;
	
	/**
	 * Constructor for Game_Chair
	 */
	public Game_Chair() {
		while(replay == false) {
			computer.start();
			player_2.start();
			int winner = bet.findWinner(computer, player_2);
			if(winner == 2) {
				System.out.println("Unfortunately, you have lost. :(");
				System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			}else if(winner == 1) {
				System.out.println("YOU HAVE WON! :D");
				System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			}else {
				System.out.println("It is a draw! :o");
				System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			}
			System.out.println("Your card was: " + player_2.card_number);
			System.out.println("Computer card was: " + computer.card_number);
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			System.out.println("Do you want to play again? Type '1' for yes, '2' for no");
			Scanner s = new Scanner(System.in);
			int choice = s.nextInt();
			if(choice == 2) {
				replay = true;
				break;
			}else {
				System.out.println("                  Here we go again!");
				System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			}
		}
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("Thank you for playing! :)");
	}
}
