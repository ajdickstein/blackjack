package card;

import java.util.Stack;
import java.util.Collections;

public class Deck {
	private Stack<Card> deck;
	
	public Deck() {
		this.deck = createDeck();
	}

	public Stack<Card> createDeck() {
		for (Suit suit : Suit.values()) {
			for (Denomination denom : Denomination.values()) {
				Card card = new Card(suit, denom);
				deck.push(card);
			}
		}
		shuffle();
		return deck;
	}

	public void shuffle() {
		Collections.shuffle(deck);
	}

	public void deal() {
		
	}
}