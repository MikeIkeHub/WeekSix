package weeksix;

public class App {

	public static void main(String[] args) {
		Deck deck = new Deck();
        Player player1 = new Player("Player One");
        Player player2 = new Player ("Player Two");
        deck.shuffleCards();

     
        for (int i = 0; i < 52; i++) {
            if ( i % 2 == 0) {
                player1.draw(deck);
            } else {
                player2.draw(deck);
            }
        }

     player1.getHand();
     System.out.println("");
     player2.getHand();
     System.out.println("");
        for (int i = 0; i < 26; i++) {
            Card p1Hand = player1.flip();
            Card p2Hand = player2.flip();
            if (p1Hand.getValue() > p2Hand.getValue()) {
                player1.incrementScore();
            } else {
                player2.incrementScore();
            }
        }
        System.out.println("\n"+ player1.getName() + " score: " + player1.getScore());
        System.out.println(player2.getName() + " score: " + player2.getScore());
       			
        if (player1.getScore() > player2.getScore()) {
       		System.out.println(player1.getName() + " Wins");
        }else if (player1.getScore() < player2.getScore()) {
        	System.out.println(player2.getName() + " Wins");
        }else {
            System.out.println("DRAW");
        }

	}

}
