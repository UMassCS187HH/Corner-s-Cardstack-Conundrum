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
		int count = 1;

		try {
			do {
				if ((clubs.isEmpty() || diamonds.isEmpty() || spades.isEmpty() || hearts.isEmpty()) && count > 5){
					System.out.println("You Lose! Bad luck.");
					break;
				}
				if (count % 4 == 0 && (!clubs.isEmpty() && !diamonds.isEmpty() && !spades.isEmpty() && !hearts.isEmpty())) {
					count++;
					System.out.println("\n\nTIME TO DRAW CARDS!\n\n");
					try {
						clubs.drawCards();
						diamonds.drawCards();
						spades.drawCards();
						hearts.drawCards();
					} catch (DeckUnderflowException e) {
						// TODO Auto-generated catch block
						System.out.println(e.info);
						break;
					}
					
				}

				else {
					count++;
					System.out.println("Clubs : " + clubs.topCard() + "- Diamonds : " + diamonds.topCard()
							+ "- Spades : " + spades.topCard() + "- Hearts : " + hearts.topCard());
					System.out.println("Card count : "
							+ (clubs.cardCount() + diamonds.cardCount() + spades.cardCount() + hearts.cardCount()));
					System.out.println("Turn #"+(count-1));
					System.out.println("Enter a suit to add a card: Clubs, Diamonds, Spades, Hearts");
					final String suit = cardIn.next();
					System.out.println("Enter a card to add: 2,3,4....Jack, Queen, King, Ace");
					final String card = cardIn.next();
					System.out.println("Suit: " + suit);
					System.out.println("Card: " + card);

					if (clubs.isValidCard(card)) {
						System.out.println("Valid card");
						switch (suit.toLowerCase()) {
						case "clubs":
							if (clubs.alreadyPlaced(card)) {
								System.out.println("You already placed that card!");
								break;
							}
							if (clubs.isFull()) {
								System.out.println("Error! The suit you are trying to add to is full!");
								break;
							}
							clubs.addCard(card);
							break;
						case "diamonds":
							if (diamonds.alreadyPlaced(card)) {
								System.out.println("You already replaced that card!");
								break;
							}
							if (diamonds.isFull()) {
								System.out.println("Error! The suit you are trying to add to is full!");
								break;
							}
							diamonds.addCard(card);
							break;
						case "spades":
							if (spades.alreadyPlaced(card)) {
								System.out.println("You already replaced that card!");
								break;
							}
							if (spades.isFull()) {
								System.out.println("Error! The suit you are trying to add to is full!");
								break;
							}
							spades.addCard(card);
							break;
						case "hearts":
							if (hearts.alreadyPlaced(card)) {
								System.out.println("You already replaced that card!");
								break;
							}
							if (hearts.isFull()) {
								System.out.println("Error! The suit you are trying to add to is full!");
								break;
							}
							hearts.addCard(card);
							break;
						}
					} else {
						System.out.println("Error! Invalid Card!");
					}
				}
				
			} while (!clubs.isFull() && !diamonds.isFull() && !spades.isFull() && !hearts.isFull());
		} finally {
			cardIn.close();	
		}
		if (clubs.isFull() && diamonds.isFull() && spades.isFull() && hearts.isFull()){
			System.out.println("Good job! You win!!!");
		} else {
			System.out.println("Maybe next time rookie.");
		}
	}
}
