import Game.Deck;
import Game.Player;
import java.util.Scanner;

public class BlackJack_main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Deck theDeck = new Deck(1, true);
		
		Player me = new Player("YOU");
		Player dealer = new Player("DEALER");
		
		me.addCard(theDeck.dealNextCard());
		dealer.addCard(theDeck.dealNextCard());
		me.addCard(theDeck.dealNextCard());
		dealer.addCard(theDeck.dealNextCard());
		
		System.out.println("Cards are dealt\n");
		me.printHand(true);
		dealer.printHand(false);
		System.out.println("\n");
		
		
        sc.close();
	

		me.printHand(true);

		dealer.printHand(true);

		

		int mySum = me.getHandSum();

		int dealerSum = dealer.getHandSum();

		

		if(mySum  > dealerSum && mySum <=21 || dealerSum > 21) {

			System.out.println("\nYour win!!");

		} 
		else 
		{

			System.out.println("\nDealer wins!");

		}




		


					   


		
		
		
	}

}
