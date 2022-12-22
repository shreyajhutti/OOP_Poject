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
	
	
	public boolean addCard(Card aCard) {
		if (this.numCards == 10) {
			System.err.printf("%s hand already has 10 cards;" + "cannot add another\n", this.name);
			System.exit(1);
		}
		
		this.hand[this.numCards] = aCard;
		this.numCards++;
		
		return (this.getHandSum() <= 21);
	}
	
	
	
	
}
