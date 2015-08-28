package player;

import card.Card;
import card.Deck;
import java.util.List;

public class Dealer extends Player {
	private List<Card> myCards;
	
	public Dealer(List<Card> myCards) {
		super(myCards);
	}

	public void turn() {
		while (getBestHandValue() < 17) {
			myCards.add(deck.pop());
		}
	}
}