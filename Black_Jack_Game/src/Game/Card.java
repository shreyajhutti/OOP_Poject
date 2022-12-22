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
	
	
	
	public String toString() {
		String numStr = "Error";  
		
		switch(this.myNumber) {
		case 2 : numStr = "Two";
		         break;
		         
		case 3 : numStr = "Three";
		         break; 
		         
		case 4 : numStr = "Four";
                 break; 
        
		case 5 : numStr = "Five";
                 break; 
        
		case 6 : numStr = "Six";
                 break; 
        
		case 7: numStr = "Seven";
                 break; 
        
		case 8 : numStr = "Eight";
                 break; 
        
		case 9 : numStr = "Nine";
                 break; 
        
		case 10 : numStr = "Ten";
                 break; 
        
		case 11 : numStr = "Jack";
                 break; 
        
		case 12 : numStr = "Queen";
                 break; 
        
		case 13 : numStr = "King";
                 break; 
        
		case 1 : numStr = "Ace";
                 break; 
                 
		}
		
		return numStr + " of " +mySuit.toString();
		
	}

}
