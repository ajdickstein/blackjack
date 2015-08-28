import card.Card;
import card.Deck;
import player.Player;
import player.Dealer;
import player.UserIO;

public class Casino {
	public static void main(String[] args) {
		System.out.println("Main!");
		blackjack();
	}

	public static void blackjack() {
		roundBlackJack();
	}

	public static void roundBlackJack() {
		Deck deck = new Deck();
		Player player = new Player();
		Dealer dealer = new Dealer();
		player.addCard(deck.pop());
		player.addCard(deck.pop());
		dealer.addCard(deck.pop());
		dealer.addCard(deck.pop());
		boolean doneHitting = false;
		while (!doneHitting) {
			if (player.isBust()) {
				System.out.println("You lose. You busted.");
				break;
			}
			if (player.hit()) {
				Card drawnCard = deck.pop();
				player.addCard(drawnCard);
				UserIO.printCardDrawn(drawnCard);
			} else {
				doneHitting = true;
			}
		}
	}
}