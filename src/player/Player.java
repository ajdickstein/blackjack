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
		boolean isAce = false;
		for (Card card : myCards) {
			Denomination denom = card.getDenomination();
			if (denom == Denomination.ACE) {
				isAce = true;
			}
			handValue += denom.getValue();
		}
		if (handValue < 12 && isAce == true) {
			handValue += 10;
		}
		return handValue;
	}


	//Returns the lowest possible hand value
	public int getMinimumHandValue() {
		int handValue = 0;
		for (Card card : myCards) {
			Denomination denom = card.getDenomination();
			handValue += denom.getValue();
		}
		return handValue;
	}
}