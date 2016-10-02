package cardstack;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CardstackTest {
	
	private Cardstack c1;
	private Cardstack c2;
	private Cardstack c3;
	private Cardstack c4;
	private Cardstack c5;
	private Cardstack c6;
	
	@Before
	public void before() {
		c1 = new Cardstack();
		c2 = new Cardstack();
		c3 = new Cardstack();
		c4 = new Cardstack();
		c5 = new Cardstack();
		c6 = new Cardstack();
	}
	@Test (timeout = 1000)
	public void testIsValidCard(){
		boolean result;
		result = c1.isValidCard("2");
		assertTrue("Good card", result);
		result = c1.isValidCard("3");
		assertTrue("Good card", result);
		result = c1.isValidCard("4");
		assertTrue("Good card", result);
		result = c1.isValidCard("5");
		assertTrue("Good card", result);
		result = c1.isValidCard("6");
		assertTrue("Good card", result);
		result = c1.isValidCard("7");
		assertTrue("Good card", result);
		result = c1.isValidCard("8");
		assertTrue("Good card", result);
		result = c1.isValidCard("9");
		assertTrue("Good card", result);
		result = c1.isValidCard("10");
		assertTrue("Good card", result);
		result = c1.isValidCard("jack");
		assertTrue("Good card", result);
		result = c1.isValidCard("queen");
		assertTrue("Good card", result);
		result = c1.isValidCard("king");
		assertTrue("Good card", result);
		result = c1.isValidCard("ace");
		assertTrue("Good card", result);

		result = c1.isValidCard("1");
		assertFalse("Bad card", result);
		result = c1.isValidCard("12");
		assertFalse("Bad card", result);
		result = c1.isValidCard("apple");
		assertFalse("Bad card", result);
		
	}
	
	
	@Test (timeout = 1000)
	public void testAddCard(){
		c1.addCard("3");
		assertEquals("Top Card is good", "3", c1.topCard());
		c1.addCard("10");
		assertEquals("Top Card is good", "10", c1.topCard());
		c1.addCard("apple");
		assertEquals("Top Card is good", "apple", c1.topCard());
		c1.addCard("yellow");
		assertEquals("Top Card is good", "yellow", c1.topCard());
	}
	
	@Test (timeout = 1000)
	public void testIsFull() {
		c2.addCard("1");c2.addCard("2");c2.addCard("3");c2.addCard("4");c2.addCard("5");c2.addCard("6");
		assertFalse("Deck is not full", c2.isFull());
		c2.addCard("7");c2.addCard("8");c2.addCard("9");c2.addCard("10");c2.addCard("11");c2.addCard("12");
		assertFalse("Deck is not full", c2.isFull());
		c2.addCard("13");
		assertTrue("Deck is full", c2.isFull());
	}
	@Test (timeout = 1000)
	public void testCardCount() {
		assertEquals("Deck is empty", 0, c3.cardCount());
		 c3.addCard("1");
		 c3.addCard("2");
		 assertEquals("Deck is empty", 2, c3.cardCount());
	}
	@Test (timeout = 1000)
	public void testAlreadyPlaced() {
		assertFalse("Deck is empty", c4.alreadyPlaced("1"));
		c4.addCard("1");
		assertTrue("Deck has 1", c4.alreadyPlaced("1"));
		c4.addCard("2");
		assertTrue("Deck has 1", c4.alreadyPlaced("1"));
		assertTrue("Deck has 2", c4.alreadyPlaced("2"));
	}
	@Test (timeout = 1000)
	public void testIsEmpty() {
		assertTrue("Deck is empty", c5.isEmpty());
		c5.addCard("1");
		assertFalse("Deck is not empty", c5.isEmpty());
	}
	
	@Test (timeout = 1000)
	public void testDrawCards() {
		//TODO
	}
	
}
