package Game;

public class Deck {
	
	private Card[] myCards;
	private Integer numCards;
	
	public Deck(Integer numDeck, boolean shuffle) {
		
		this.numCards = numDeck * 52;
		this.myCards = new Card[this.numCards];
		
		Integer card = 0;
		
		for(Integer deck = 0; deck < numDeck; deck++ ) {
			
			for(Integer suit = 0; suit < 4; suit++) {
				
				for(Integer number = 1; number <= 13; number++) {
					
					this.myCards[card] = new Card(Suit.values()[suit], number);
					card++;
					
				}
			}
		}
		
	}
}
