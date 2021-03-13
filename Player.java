package weeksix;

import java.util.ArrayList;
import java.util.List;

public class Player {
	private String name;
	private int score;
	private List<Card> hand = new ArrayList<Card>();
	
	public Player(String name){
		this.name = name;
		this.score = 0;
	}
	
	public void getHand() {
		System.out.println(name + " Has these cards:");
		for(Card card : hand) {
			card.describe();
		}
	}
	
	public Card flip() {
		return hand.remove(0);
	}
	
	public void draw(Deck card) {
		hand.add(card.drawCard());
	}
	
	public void incrementScore() {
		score++;
	}
	
	public int getScore() {
        return score;
    }
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}