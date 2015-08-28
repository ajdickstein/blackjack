package player;

import card.Card;
import card.Denomination;
import card.Deck;
import java.util.List;
import java.util.ArrayList;

public class Player {
	private List<Card> myCards;

	public Player() {
		this.myCards = new ArrayList<>();
	}

	// Returns true if should hit again
	public boolean hit() {
		UserIO.printHand(myCards);
		boolean hitOrNot = UserIO.promptUserHitting();
		return hitOrNot;
	}

	public void addCard(Card card) {
		myCards.add(card);
	}

	public boolean isBust() {
		if (getBestHandValue() > 21) {
			return true;
		}
		return false;
	}

	// Returns the best possible hand value
	protected int getBestHandValue() {
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
	protected int getMinimumHandValue() {
		int handValue = 0;
		for (Card card : myCards) {
			Denomination denom = card.getDenomination();
			handValue += denom.getValue();
		}
		return handValue;
	}
}