#Corner’s Cardstack Conundrum
###Cardstacking fun with a Bounded Producer Consumer

Jagath Jai Kumar – jjaikumar@gmail.com
##Overview

For this project, you will be implementing a Bounded Producer-Consumer via a LinkedList. The data structure will simulate a special card shuffler that is organizing a deck while someone draws cards from the deck regularly. There are 9 methods to implement for this project.

The Bounded Producer Consumer structure will be used to handle the different requests from the dealer and the player. The dealer (you) will be trying to organize the deck of cards in order by suits while the player (computer) will draw cards at random from each suit. The Bounded PC will manage dealer producing and the player consuming.

In the project, you will be designing one LinkedList that will be used in 4 implementations to manage each suit of cards. The starter code will manage the state of each suit and the player drawings. Most of the methods you implement will be for the dealer who will be stacking the cards.  

##Bounded Producer-Consumer

From *Wikipedia*:

In computing, the producer–consumer problem (also known as the bounded-buffer problem) is a classic example of a multi-process synchronization problem. The problem describes two processes, the producer and the consumer, who share a common, fixed-size buffer used as a queue. The producer's job is to generate data, put it into the buffer, and start again. At the same time, the consumer is consuming the data (i.e., removing it from the buffer), one piece at a time. 
In other words, a Bounded PC manages an incoming and an outgoing request without letting the buffer overflow in either direction.

##Gameplay

The rules of the game are simple. A dealer is stacking cards randomly into 4 piles organized by suit. He does not care about the order within the piles. He adds one card at a time (making sure it is a valid card), and he makes sure the cards are face up so he always sees the card on top of the pile. Every 4th time he plays a card a non-empty pile, however, his silly pal Mark comes over and draws a random number of cards from the pile. If Mark grabs all the cards from a pile, the dealer loses! However, if Mark does not grab the whole pile, the dealer can keep playing until he wins and Mark is sad. 

##Methods to Implement

public Cardstack()
	public void addCard(String card) 
	public boolean isEmpty()
	public boolean isFull() 
	public int cardCount() 
	public String topCard() 
	public boolean alreadyPlaced(String card) 
	public boolean isValidCard (String card)
	public String drawCard(String suit)

