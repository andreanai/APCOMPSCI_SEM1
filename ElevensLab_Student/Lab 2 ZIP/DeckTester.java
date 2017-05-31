/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
            String[] ranks={"Ace","King","Queen","Jack","Ten","Nine","Eight",
                            "Seven","Six","Five","Four","Three","Two"};
            String[] suits={"Spades","Clubs","Diamonds","Hearts"};
            int[] points={11,10,10,10,10,9,8,7,6,5,4,3,2};
            int maxSize=0;
            Deck deck=new Deck(ranks,suits,points);
            System.out.println("New deck size is "+(maxSize=deck.size())+ " cards");
            System.out.println(deck.toString());
            for(int i=0; i <= maxSize;i++)
            {
                Card theCard=deck.deal();
                if(theCard!=null)
                    System.out.println("Card #"+(i+1)+" left in deck "+deck.size()+";"+theCard.toString());
                else
                    System.out.println("Card #"+(i+1)+"!! DECK IS EMPTY!!");
            }
            deck.shuffle();
            for(int i=0; i <= maxSize;i++)
            {
                Card theCard=deck.deal();
                if(theCard!=null)
                    System.out.println("Card #"+(i+1)+" left in deck "+deck.size()+";"+theCard.toString());
                else
                    System.out.println("Card #"+(i+1)+"!! DECK IS EMPTY!!");
            }
	}
}
