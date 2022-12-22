package Game;

public class Card {
	
	private Suit mySuit;        //Diamonds,Hearts,Clubs,Spades
	private Integer myNumber;   //2,3,4,5,6,7,8,9,ace=1,jack=11,queen=12,king=13
	
	public Card(Suit aSuit, Integer aNumber) {
		
		this.mySuit = aSuit;
		this.myNumber = aNumber;
	}

	public Integer getMyNumber() {
		return myNumber;
	}

}
