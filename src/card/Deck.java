package card;

import java.util.Stack;
import java.util.Collections;

public class Deck {
	private Stack<Card> deck;
	
	public Deck() {
		this.deck = new Stack<>();
		initializeDeck();
		shuffle();
	}

	public void initializeDeck() {
		for (Suit suit : Suit.values()) {
			for (Denomination denom : Denomination.values()) {
				Card card = new Card(suit, denom);
				deck.push(card);
			}
		}
		shuffle();
	}

	public void shuffle() {
		Collections.shuffle(deck);
	}

	public Card pop() {
		return deck.pop();
	}
}