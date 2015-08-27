package player;

import card.Card;
import card.Denomination;
import java.util.List;
import java.util.ArrayList;

public class Player {
	private List<Card> myCards;

	public Player(List<Card> myCards) {
		this.myCards = myCards;
	}

	// Returns true if should hit again
	public boolean hit() {
		return false;
	}

	// Returns the best possible hand value
	public int getBestHandValue() {
		int handValue = 0;
		for (Card card : myCards) {
			Denomination denom = card.getDenomination();
			switch (denom) {
				

				case ACE: handValue += 11; break;

				default: handValue += denom.getValue();
			}
		}
		return -1;
	}

	// Returns the lowest possible hand value
	public int getMinimumHandValue() {
		return -1;
	}
}