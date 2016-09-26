package cardstack;

import java.util.Scanner;

import cardstack.Cardstack;

public class CardstackCommander {
	public static void main(String[] args) {
		Scanner cardIn = new Scanner(System.in);
		Cardstack clubs = new Cardstack();
		Cardstack diamonds = new Cardstack();
		Cardstack spades = new Cardstack();
		Cardstack hearts = new Cardstack();

		try {
			do {
				System.out.println("Clubs : " + clubs.topCard() + "- Diamonds : " + diamonds.topCard() + "- Spades : "
						+ spades.topCard() + "- Hearts : " + hearts.topCard());
				System.out.println("Card count : " + (clubs.cardCount() + diamonds.cardCount() + spades.cardCount()
						+ hearts.cardCount()));

				System.out.println("Enter a suit to add a card: Clubs, Diamonds, Spades, Hearts");
				final String suit = cardIn.next();
				System.out.println("Enter a card to add: 2,3,4....Jack, Queen, King, Ace");
				final String card = cardIn.next();
				System.out.println("Suit: " + suit);
				System.out.println("Card: " + card);

				
				
				if (clubs.isValidCard(card)) {
					switch (suit.toLowerCase()) {
					case "clubs":
						if (clubs.alreadyPlaced(card)){
							System.out.println("You already replaced that card!");
							break;
						}
						if (clubs.isFull()){
							System.out.println("Error! The suit you are trying to add to is full!");
							break;
						}
						clubs.addCard(card);
					case "diamonds":
						if (diamonds.alreadyPlaced(card)){
							System.out.println("You already replaced that card!");
							break;
						}
						if (diamonds.isFull()){
							System.out.println("Error! The suit you are trying to add to is full!");
							break;
						}
						diamonds.addCard(card);
					case "spades":
						if (spades.alreadyPlaced(card)){
							System.out.println("You already replaced that card!");
							break;
						}
						if (spades.isFull()){
							System.out.println("Error! The suit you are trying to add to is full!");
							break;
						}
						spades.addCard(card);
					case "hearts":
						if (hearts.alreadyPlaced(card)){
							System.out.println("You already replaced that card!");
							break;
						}
						if (hearts.isFull()){
							System.out.println("Error! The suit you are trying to add to is full!");
							break;
						}
						hearts.addCard(card);
					}
				} else {
					System.out.println("Error! Invalid Card!");
				}

			} while (!clubs.isFull() && !diamonds.isFull() && !spades.isFull() && !hearts.isFull());
		} finally {
			cardIn.close();
		}
		System.out.println("Good job! You win!!!");

	}
}
