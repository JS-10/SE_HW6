package bet_more_game;

import java.util.Scanner;

/**
 * Includes game logic for the "Bet More" game.
 * 
 * @author Johannes
 *
 */
public class BetMore_Game {

	public Shuffle s = new Shuffle();
	public boolean isComputer = false;
	
	/**
	 * Game logic depending on whether the computer or the actual player plays.
	 * 
	 * @return card number
	 */
	public int play() {
		int card_number = 0;
		boolean user_selected = false;
		int requests = 6; // 5 possible extra tries + the initial one
		int choice = 0; // select card = 1; new card = 2
		do {
			card_number = s.pickCard();
			if(isComputer) {
				user_selected = true;
				break;
			}
			requests -= 1;
			System.out.println("Your card is: " + card_number);
			if(requests > 1) {
				System.out.println("Do you want to keep your card? Type '1' for yes, '2' for no (You can request a new card " + requests + " more times)");
				Scanner s = new Scanner(System.in);
				choice = s.nextInt();
			}
			if(requests == 1) {
				System.out.println("Do you want to keep your card? Type '1' for yes, '2' for no (You can request a new card " + requests + " more time)");
				Scanner s = new Scanner(System.in);
				choice = s.nextInt();
			}
			if(choice == 1 || requests == 0) {
				System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
				user_selected = true;
				break;
			}
		}while(user_selected == false);
		return card_number;
	}
	
	/**
	 * Selects the winner of the round. If the card number of Player 2 was higher than the card number of computer, the player has won the round.
	 *  But if the card number of Player 2 is lower than the one of the computer, the player has lost. If both numbers are equal, it is a draw.
	 * 
	 * @param system, Computer
	 * @param player_2, Player 2
	 * @return winner
	 */
	public int findWinner(Player system, Player player_2) {
		int winner = 0; //Draw
		if(system.card_number > player_2.card_number) {
			winner = 2; //Lost
		}else if(system.card_number < player_2.card_number) {
			winner = 1; //Won
		}
		return winner;
	}
}
