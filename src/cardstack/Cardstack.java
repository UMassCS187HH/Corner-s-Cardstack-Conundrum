package cardstack;

import java.util.Random;

public class Cardstack {

	LLCardNode head;
	public Cardstack(){
		// TODO (1)
		head = null;
	}
	public void addCard(String card) {
		// TODO (2)
		if (this.isEmpty()){
			head = new LLCardNode(card);
		} else {
			LLCardNode ptr = head;
			while (ptr.getLink()!=null) {
				ptr = ptr.getLink();
			}
			ptr.setLink(new LLCardNode(card));
		}
	}
	
	public boolean isFull() {
		// TODO (3)
		return (cardCount()==13);
	}
	
	public int cardCount() {
		// TODO (4)
		LLCardNode ptr = head;
		int count = 0;
		while(ptr!=null){
			count++;
			ptr = ptr.getLink();
		}
		return count;
	}
	public String topCard() {
		// TODO (5)
		if (this.isEmpty()){
			return null;
		}
		
		LLCardNode ptr = head;
		while (ptr.getLink()!=null) {
			ptr = ptr.getLink();
		}
		return ptr.getData();
	}
	public boolean alreadyPlaced(String card) {
		// TODO (6)
		if (this.isEmpty()){
			return false;
		}
		LLCardNode ptr = head;
		while(ptr!=null){
			if (ptr.getData().equals(card)){
				return true;
			} else {
				ptr = ptr.getLink();
			}
		}
		return false;
	}
	public boolean isValidCard (String card){
		// TODO (7)
		String[] valids = {"2","3","4","5","6","7","8","9","10","jack","queen","king","ace"};
		String c = card.toLowerCase();
		for (int i = 0; i < valids.length; i++){
			if (valids[i].equals(c)){
				return true;
			}
		}
		
		return false;
	}
	public String drawCards() throws DeckUnderflowException{
		// TODO (8)
		Random r = new Random();
		int numCards = r.nextInt(cardCount()+1);
		System.out.println("Number of cards drawn is: "+numCards );
		if (numCards >= this.cardCount()){
			throw new DeckUnderflowException("Oh no!! Mark stole all your cards!");
		}
		
		for (int i = 0; i < numCards; i++){
			LLCardNode ptr = head;
			while (ptr.getLink().getLink()!=null){
				ptr = ptr.getLink();
			}
			ptr.setLink(null);
		}
		return this.topCard();
	}
	public boolean isEmpty() {
		// TODO (9)
		return (head==null);
	}

}
