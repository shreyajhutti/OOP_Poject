package blackjack;

public class Card {
	
	private Suit mySuit; //Diamonds,Hearts,Clubs,Spades
	private int myNumber; //1,2,3,4,5,6,7,8,9,ace,jack,queen,king
	
	public Card(Suit aSuit, int aNumber) {
		
		this.mySuit = aSuit;
		this.myNumber = aNumber;
	}
 
}
