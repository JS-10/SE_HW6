package bet_more_game;

/**
 * Creates a player for the "BetMore" game.
 * 
 * @author Johannes
 *
 */
public class Player {

	public String name;
	public int card_number = 0;
	public BetMore_Game bet = new BetMore_Game();
	
	/**
	 * Constructor of Player
	 * 
	 * @param name, Computer or Player_2
	 */
	public Player(String name) {
		this.name = name;
	}
	
	/**
	 * Starts the game.
	 * 
	 * @return card number
	 */
	public int start() {
		if(name.equals("Computer")) {
			bet.isComputer = true;
		}
		this.card_number = bet.play();
		return card_number;
	}
}
