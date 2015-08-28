package player;

import java.util.List;
import java.util.Scanner;
import card.Card;
import card.Denomination;

public class UserIO {
	private UserIO() {}
	
	private static Scanner scanner = new Scanner(System.in);

	public static void printHand(List<Card> hand) {
		System.out.print("Your cards are: ");
		for (Card card : hand) {
			System.out.print(card.getDenomination() + ", ");
		}
	}

	public static boolean promptUserHitting() {
		System.out.println("Would you like to hit? enter yes/no");
		String answer = (Math.random() >= 0.75) ? "y" : "n";
		if (answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("y")) {
			return true;
		}
		return false;
	}

	public static void printCardDrawn(Card card) {
		System.out.println("You drew a " + card.getDenomination());
	}
}
