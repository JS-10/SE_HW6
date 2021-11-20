package bet_more_game;

import java.util.Scanner;

/**
 * Main class of the "BetMore" game.
 * 
 * @author Johannes
 *
 */
public class Main {

	public static void main(String[] args) {
		Game_Chair chair;
		Scanner s = new Scanner(System.in);
		System.out.println("~~~~~~~~~~~~ Welcome to the 'BetMore' game! ~~~~~~~~~~~~");
		System.out.println("Do you want to play a round? Type '1' to start the game!");
		int start = s.nextInt();
		
		while(start != 1) {
			System.err.println("Input invalid. Type '1' to start the game!");
			start = s.nextInt();
		}
		
		if(start == 1) {
			System.out.println("                    Okay let's go!");
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			chair = new Game_Chair();
		}
	}

}
