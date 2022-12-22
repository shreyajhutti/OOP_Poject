package Game;

public class Player {
	
	private String name;
	
	private Card[] hand = new Card[10];
	
	private int numCards;
	
	public Player(String aName) {
		this.name = aName;
		
		this.emptyHand();
	}

	
	public void emptyHand() {
		
		for (Integer card =0; card < 10; card++) {
			
			this.hand[card] = null;
			
		}
		
		this.numCards = 0;
		
	}
	
	
}
