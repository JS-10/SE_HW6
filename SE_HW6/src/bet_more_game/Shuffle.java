package bet_more_game;

/**
 * Generates a random number between 1 and 100.
 * 
 * @author Johannes
 *
 */
public class Shuffle {

	/**
	 * Picks a card with a random number between 1 and 100.
	 * 
	 * @return card number
	 */
	public int pickCard() {
		int card_number = (int) Math.rint((Math.random() * 99) + 1);
		return card_number;
	}
}
