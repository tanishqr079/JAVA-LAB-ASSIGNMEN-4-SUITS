
// Deck.java
import java.util.*;
class Deck {
	ArrayList<Card> deck;

	public Deck() {
		deck = new ArrayList<>();
		createDeck();
	}

	public void createDeck() {
		String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
		String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};

		for (String suit : suits) {
			for (String rank : ranks) {
				deck.add(new Card(rank, suit));
			}
		}
	}

	public void printDeck() {
		for (Card card : deck) {
			System.out.println(card);
		}
	}

	public void printCard(int index) {
		if (index >= 0 && index < deck.size()) {
			System.out.println(deck.get(index));
		} else {
			System.out.println("Invalid card index!");
		}
	}

	public void sameCard(String suit) {
		for (Card card : deck) {
			if (card.suit.equalsIgnoreCase(suit)) {
				System.out.println(card);
			}
		}
	}

	public void compareCard(String rank) {
		for (Card card : deck) {
			if (card.rank.equalsIgnoreCase(rank)) {
				System.out.println(card);
			}
		}
	}

	public void findCard(String rank, String suit) {
		for (Card card : deck) {
			if (card.rank.equalsIgnoreCase(rank) && card.suit.equalsIgnoreCase(suit)) {
				System.out.println("Card found: " + card);
				return;
			}
		}
		System.out.println("Card not found");
	}

	public void dealCard() {
		shuffleDeck();
		for (int i = 0; i < 5; i++) {
			System.out.println(deck.get(i));
		}
	}

	public void shuffleDeck() {
		Collections.shuffle(deck);
	}
}