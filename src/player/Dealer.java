package player;

import card.Card;
import card.Deck;
import java.util.List;

public class Dealer extends Player {
	//@Override
	public boolean hit() {
		if (getBestHandValue() < 17) {
			return true;
		}
		return false;
	}
}