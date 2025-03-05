// NAME: TANISHQ RATDIYA
//PRN 23070126133
// AIML B3d
// Main.java
import java.util.Scanner;
class Main {
	public static void main(String[] args) {
		Deck deck = new Deck();
		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.println("\nMenu:");
			System.out.println("1. Print Deck");
			System.out.println("2. Print a Specific Card");
			System.out.println("3. Find Cards of the Same Suit");
			System.out.println("4. Find Cards with the Same Rank");
			System.out.println("5. Search for a Specific Card");
			System.out.println("6. Deal 5 Random Cards");
			System.out.println("7. Shuffle Deck");
			System.out.println("8. Exit");
			System.out.print("Enter choice: ");
			int choice = scanner.nextInt();

			switch (choice) {
				case 1:
					deck.printDeck();
					break;
				case 2:
					System.out.print("Enter card index (0-51): ");
					int index = scanner.nextInt();
					deck.printCard(index);
					break;
				case 3:
					System.out.print("Enter suit (Spades, Hearts, Diamonds, Clubs): ");
					scanner.nextLine();
					String suit = scanner.nextLine();
					deck.sameCard(suit);
					break;
				case 4:
					System.out.print("Enter rank (2-10, J, Q, K, A): ");
					scanner.nextLine();
					String rank = scanner.nextLine();
					deck.compareCard(rank);
					break;
				case 5:
					System.out.print("Enter rank: ");
					scanner.nextLine();
					String searchRank = scanner.nextLine();
					System.out.print("Enter suit: ");
					String searchSuit = scanner.nextLine();
					deck.findCard(searchRank, searchSuit);
					break;
				case 6:
					deck.dealCard();
					break;
				case 7:
					deck.shuffleDeck();
					System.out.println("Deck shuffled.");
					break;
				case 8:
					System.out.println("Exiting...");
					scanner.close();
					return;
				default:
					System.out.println("Invalid choice! Try again.");
			}
		}
	}
}
