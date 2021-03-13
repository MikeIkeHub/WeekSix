package weeksix;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	private List<Card> deck = new ArrayList<Card>(); //creates a List using Card class. <suit, value>
	private String[] suit = {"Spades", "Diamonds", "Clubs","Hearts"};
	
	public Deck() { //used to create a new deck of cards
		for(int i = 0; i < suit.length; i++) {
			for(int j = 2; j < 15; j++) {
				deck.add(new Card(suit[i], j)); //creates new instances of Card class
			}
		}
	}
	
	public void shuffleCards() {
		Collections.shuffle(deck);
	}
	
	public Card drawCard() {
		return deck.remove(0);
	}
	
}