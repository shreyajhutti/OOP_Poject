package Game;

import java.util.Random;

public class Deck {
	
	private Card[] myCards;
	
	
	private Integer numCards;
	
	public Deck() {
		
		this(1,false);
		
	}
	
	
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
		
		if (shuffle==true) {
			this.shuffle();
		}
		
		
	}
	
	public void shuffle() {
		
		Random rng = new Random();    //RandomNumberGenerator
		
		Card temp;
		
		Integer j;
		for(Integer i =0; i < this.numCards; i++) {
			
			j = rng.nextInt(this.numCards);
			
			temp = this.myCards[i];
			this.myCards[i]=this.myCards[j];
			this.myCards[j]=temp;
			
		}
		
	}
	
	
	
}
